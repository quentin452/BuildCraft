## Welcome to the GTNH fork of Buildcraft on GitHub

### Reporting an issue

Please report issues to the [GTNH GitHub](https://github.com/GTNewHorizons/GT-New-Horizons-Modpack/issues)

### Contributing

If you wish to submit a pull request to fix bugs or broken behaviour feel free to do so. If you would like to add 
features or change existing behaviour or balance, please discuss it on the feature ideas board before (http://mod-buildcraft.com/forums/index.php?board=4.0 before).

Do not submit pull requests which solely "fix" formatting. As these kinds of changes are usually very intrusive in commit history and everyone has their own idea what "proper formatting" is, they should be done by one of the main contributors. 
Please only submit "code cleanup", if the changes actually have a substantial impact on readability.

PR implementing new features or changing large portions of code are helpful. But if you're doing such a change and if it gets accepted, please don't "fire and forget". Complex changes are introducing bugs, and as thourough as testing and peer review may be, there will be bugs. Please carry on playing your changes after initial commit and fix residual issues. It is extremely frustrating for others to spend days fixing regressions introduced by unmaintained submissions.

#### Frequently reported

* java.lang.AbstractMethodError, java.lang.NoSuchMethodException
  * A mod has not updated to the current BuildCraft API
  * You are not using the correct version of BuildCraft for your Forge/Minecraft versions
  * You are using the dev version on a normal game instance (or vice versa)
* Render issue (Quarry causes flickering) - Try without OptiFine first! This is a known issue with some versions of OptiFine.

### Compiling and packaging Buildcraft
1. Ensure that `java8` (found [here](https://github.com/graalvm/graalvm-ce-builds/releases/tag/vm-21.2.0)), `git` (found [here](http://git-scm.com/)) are installed correctly on your system.
1. Create a base directory for the build
1. Clone the Buildcraft repository into 'baseDir/BuildCraft/'
 * Optional: Copy BuildCraft localization repository into `baseDir/BuildCraft-Localization`
1. Navigate to basedir/BuildCraft in a shell and run one of two commands:
 * `gradlew setupCIWorkspace build` to just build a current jar (this may take a while).
 * `gradlew setupDecompWorkspace` to setup a complete developement enviroment.
 * With `Gradle` installed: use `gradle` instead of `gradlew`
 * On Windows: use `gradlew.bat` instead of `gradlew`
1. The compiled and obfuscated jar will be in 'baseDir/BuildCraft/build/libs'

Your directory structure should look like this before running gradle:
***

    baseDir
    \- BuildCraft
     |- buildcraft_resources
     |- common
     |- ...
    \- BuildCraft-Localization
     |- lang

***

And like this after running gradle:
***

    basedir
    \- BuildCraft
     |- .gradle
     |- build
     |- buildcraft_resources
     |- common
     |- ...
    \- BuildCraft-Localization
     |- lang

***

