Hotkey, *LButton, Toggle
Hotkey, *RButton, Toggle
 
Gui, Add, Tab, x2 y-1 w297 h225 , Info|Autoclicker|FastPlace|Pomoc|Creditsy
Gui, Tab, Info
Gui, Font, S30 CDefault, Impact
Gui, Add, Text, x65 y70 w230 h70 , queroClicker
Gui, Font, S20 CDefault, Verdana
Gui, Add, Text, x65 y110 w200 h40 , AutoClicker
Gui, Font, S10 CDefault, Verdana
Gui, Add, Text, x5 y205 w210 h17 , Wersja: 2.0
Gui, Tab, Autoclicker
Gui, Add, Text, x10 y29 w277 h20 , Min. Opóżnienie (w milisekundach)
Gui, Add, Slider, x10 y49 w277 h30 vMin gMin ToolTip Range0-500, 21
Gui, Add, Text, x10 y89 w277 h20 , Max. Opóżnienie (w milisekundach)
Gui, Add, Slider, x10 y109 w277 h30 vMax gMax ToolTip Range0-500, 116
Gui, Tab, FastPlace
Gui, Add, Text, x10 y29 w277 h20 , Min. Opóżnienie (w milisekundach)
Gui, Add, Slider, x10 y49 w277 h30 vMinBuild gMinBuild ToolTip Range0-500, 25
Gui, Add, Text, x10 y89 w277 h20 , Max. Opóżnienie (w milisekundach)
Gui, Add, Slider, x10 y109 w277 h30 vMaxBuild gMaxBuild ToolTip Range0-500, 62
Gui, Tab, Pomoc
Gui, Add, Text, x12 y29 w220 h30 , Przełączenie autoclickera: ]
Gui, Add, Text, x12 y49 w250 h30 , Użycie autoclickera: Przytrzymaj LPM
Gui, Add, Text, x12 y69 w220 h30 , Przełączenie Fastplace'a: [
Gui, Add, Text, x12 y89 w220 h30 , Użycie FastPlace'a: Przytrzymaj PPM
Gui, Tab, Creditsy
Gui, Add, Text, cBlue gKod, Kod źródłowy (click)
Gui, Show, x50 y50 h225 w300, AutoClicker dla widzow
Gui, Submit, NoHide
Return
 
Min:
{
Gui, Submit, NoHide
}
return
 
Max:
{
Gui, Submit, NoHide
}
return
 
MinBuild:
{
Gui, Submit, NoHide
}
return
 
MaxBuild:
{
Gui, Submit, NoHide
}
return
 
;Autoclicker
]::Hotkey, *LButton, Toggle
*LButton::
Send,{LButton}
While GetKeyState("LButton", "P")
{
Send,{LButton}
Random, delay, %Min%, %Max%
Sleep %delay%
}
return
 
;FastPlace
[::Hotkey, *RButton, Toggle
*RButton::
Send,{RButton}
While GetKeyState("RButton", "P")
{
Send,{RButton}
Random, delay, %MinBuild%, %MaxBuild%
Sleep %delay%
}
return
 
Kod:
run https://pastebin.com/S4ydgV76
return
 
GuiClose:
ExitApp