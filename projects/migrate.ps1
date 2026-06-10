$files = Get-ChildItem -Path "projects" -Include "*.java" -Recurse
foreach ($f in $files) {
    $content = Get-Content $f.FullName -Raw
    $changed = $false

    if ($content -match "org.junit.") {
        $content = $content -replace 'import org.junit.Test;', 'import org.junit.jupiter.api.Test;'
        $content = $content -replace 'import org.junit.Before;', 'import org.junit.jupiter.api.BeforeEach;'
        $content = $content -replace 'import org.junit.After;', 'import org.junit.jupiter.api.AfterEach;'
        $content = $content -replace 'import org.junit.BeforeClass;', 'import org.junit.jupiter.api.BeforeAll;'
        $content = $content -replace 'import org.junit.AfterClass;', 'import org.junit.jupiter.api.AfterAll;'
        $content = $content -replace 'import org.junit.Ignore;', 'import org.junit.jupiter.api.Disabled;'
        
        $content = $content -replace '@Before\b', '@BeforeEach'
        $content = $content -replace '@After\b', '@AfterEach'
        $content = $content -replace '@BeforeClass\b', '@BeforeAll'
        $content = $content -replace '@AfterClass\b', '@AfterAll'
        $content = $content -replace '@Ignore\b', '@Disabled'

        $content = $content -replace 'import org.junit.Assert;', 'import org.junit.jupiter.api.Assertions;'
        $content = $content -replace '\bAssert\.', 'Assertions.'

        $content = $content -replace '@RunWith\(.*?Runner\.class\)', '@org.junit.platform.suite.api.Suite
@org.junit.platform.suite.api.SelectClasses({/* TODO */})'
        
        $content = $content -replace 'import org.junit.runner.RunWith;', 'import org.junit.platform.suite.api.Suite;'
        
        $changed = $true
    }
    
    if ($changed) {
        Set-Content -Path $f.FullName -Value $content -NoNewline
        Write-Host "Updated $($f.FullName)"
    }
}
