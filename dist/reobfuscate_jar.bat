SET mod-jar="SharpnetMod_1.6.4.jar"
SET path-7zip="C:\Program Files\7-Zip"
SET path-mod-dist="Z:\Games\Minecraft\mods\moding\1.6.4\my\SharpnetMod_1.6.4\dist"
SET path-mcp="Z:\Games\Minecraft\mods\moding\1.6.4\forge-1.6.4-9.11.1.1345\mcp"
SET path-this=%~dp0

%path-7zip%\7z.exe x %path-mod-dist%\%mod-jar% -o%path-mcp%\bin\minecraft\ -aoa -mmt

cd %path-mcp%\
runtime\bin\python\python_mcp runtime\reobfuscate.py %*
cd %path-this%\

%path-7zip%\7z.exe u %path-mod-dist%\%mod-jar% %path-mcp%\reobf\minecraft\* -mmt -aoa

pause