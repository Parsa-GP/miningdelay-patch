# MP Mining Delay Parity
This mod lets you **click mine** in multiplayer servers. it does NOT skip the delay, you have to still "click mine" to skip it. 

> [!Warning]
> Use it at your own risk in multiplayer servers since it could count as cheating.

If you want to skip the delay entirely (so there's no need to click mine), install these two mods instead:
 - [Click Mining Forever](https://modrinth.com/mod/click-mining-forever) (Babric)
 - [Minecraft beta mining cooldown fix](https://github.com/dnarkevi/minecraft-beta-mining-delay-fix) (.class replacement)

# What is Click Mining?
Once upon a time, There was a thing called "Click Mining". When you were breaking a block, between each block breakage, there was a hard coded 5 tick delay. You could release the mouse button right after you broke that block (before the 5 tick delay ends) and re-press it to skip the delay entirely and mine faster. ([technical explenation here](https://lochlainnb.github.io/b1.7.3Wiki/mechanic/mining/#releasing-the-attack-button)). However, in b1.7.3, this phenomenon was [fixed in the multiplayer code](https://lochlainnb.github.io/b1.7.3Wiki/mechanic/mining/#the-pause-in-multiplayer).

### Comparison

<video src="https://files.catbox.moe/xfg7bn.mp4" width="640" height="360" title="demonstration">

|               | Image | Duration |
|---------------|-------|----------|
| Normal Mining (vanilla) |<img width="900" height="84" alt="wo_normal" src="https://files.catbox.moe/h2gas9.png" title="1st row (blue): mouse click \| 2nd row (brown): block break duration \| 3rd (gray): the 5 tick delay" /> | 00:02.22 |
| Click Mining  (vanilla) | <img width="990" height="84" alt="wo_click" src="https://files.catbox.moe/3f4joy.png" title="1st row (blue): mouse click \| 2nd row (brown): block break duration \| 3rd (gray): the 5 tick delay" /> | 00:03.01 
| Normal Mining (mod) | <img width="840" height="85" alt="wm_normal" src="https://files.catbox.moe/2px5w5.png" title="1st row (blue): mouse click \| 2nd row (brown): block break duration \| 3rd (gray): the 5 tick delay" /> | 00:02.20 |
| Click Mining  (mod) | <img width="760" height="84" alt="wm_click" src="https://files.catbox.moe/fgske0.png" title="1st row (blue): mouse click \| 2nd row (brown): block break duration \| 3rd (gray): the 5 tick delay" /> | 00:02.10 |

> [!Notice]
> the results above wasn't tested in an standard environment with correct tools and resources. and only include multiplaye behavior since singleplayer code was untouched.

# Build
``` sh
./gradlew build
```
The compiled mod should be in `./build/libs` (use the one without the `-sources` suffix).

# Special thanks to
- [https://github.com/calmilamsy/stationapi-example-mod](https://github.com/calmilamsy/stationapi-example-mod)
- [https://github.com/MCPHackers/RetroMCP-Java](https://github.com/MCPHackers/RetroMCP-Java)
- [https://babric.github.io/](https://babric.github.io/)
