set PHP_HOME="D:\Work\Platforms\php\php-5.2.17-Win32-VC6-x86"
set APACHE_HOME="D:\Work\Servers\Web\apache243\bin"
set PATH=%PATH%;%APACHE_HOME%
cmd /k httpd -k start -n Apache243_DamTiKartu
exit /b 0