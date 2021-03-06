CyanogenMod 10.2
=============================
Device Tree for Samsung Galaxy Ace 2
(GT-I8160)

How to build:
=============

- Make a workspace

  $ mkdir -p ~/cyanogenmod/system
  $ cd ~/cyanogenmod/system
  
- Do repo init & sync

  repo init https://github.com/TeamCanjica/android.git -b cm-10.2
  
  repo sync -j32

- Setup vendor
  
  ./vendor/cm/get-prebuilts
  
  . build/envsetup.sh

- Pull all not merged fixes from gerrit:
  
        cd frameworks/av
        git fetch http://review.cyanogenmod.org/CyanogenMod/android_frameworks_av refs/changes/32/52032/3
        git cherry-pick FETCH_HEAD
        cd ..
        cd native
        git fetch http://review.cyanogenmod.org/CyanogenMod/android_frameworks_native refs/changes/33/52033/5
        git cherry-pick FETCH_HEAD
        cd ../..
        cd system/core
        git fetch http://review.cyanogenmod.org/CyanogenMod/android_system_core refs/changes/34/52034/2
        git cherry-pick FETCH_HEAD
        cd ../..
        cd hardware/libhardware_legacy
        git fetch https://github.com/TeamCanjica/android_hardware_libhardware_legacy cm-10.2
        git cherry-pick 60207c7e08182e122030547cc3e22d8b27ec623b
        cd ../..
        cd build
        git fetch https://github.com/TeamCanjica/android_build cm-10.2
        git cherry-pick 8f031162d08dadd1595d8c1e42d23134bbdb93d3
        cd ..
        cd packages/apps/Phone
        git fetch https://github.com/TeamCanjica/android_packages_apps_Phone cm-10.2
        git cherry-pick 28f255779152310dfcf4bb232112017ea631e668
        cd ../../..

- Build CM10.2
  
  brunch codina


- Thanks : CyanogenMod, dh-harald, Sakura Droid, jereksel, TeamCanjica, ekim.tecul

