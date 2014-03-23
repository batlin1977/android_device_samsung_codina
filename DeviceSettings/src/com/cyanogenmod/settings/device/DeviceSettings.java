package com.cyanogenmod.settings.device;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class DeviceSettings extends Activity implements OnItemClickListener{
	

	public static final String SHARED_PREFERENCES_BASENAME = "com.cyanogenmod.settings.device";
	public static final String ACTION_UPDATE_PREFERENCES = "com.cyanogenmod.settings.device.UPDATE";
	public static final String KEY_HSPA = "hspa";
	public static final String KEY_USE_ACCELEROMETER_CALIBRATION = "use_accelerometer_calibration";
	public static final String KEY_CALIBRATE_ACCELEROMETER = "calibrate_accelerometer";
	public static final String KEY_USB_OTG_POWER = "usb_otg_power";
	public static final String KEY_DEEPEST_SLEEP_STATE = "deepest_sleep_state";
	public static final String KEY_AC_CURRENCY = "ac_currency";
	public static final String KEY_USB_CURRENCY = "usb_currency";
	public static final String KEY_FSYNC_MODE = "fsync_mode";
	public static final String KEY_TCP_CONTROL = "tcp_control";
	public static final String KEY_MALI_L2MR = "mali_l2_mr";
	public static final String KEY_MALI_PAM = "mali_pam";
	public static final String KEY_USE_SWEEP2WAKE = "use_sweep2wake";
	public static final String KEY_X_SWEEP2WAKE = "x_sweep2wake";
	public static final String KEY_Y_SWEEP2WAKE = "y_sweep2wake";
	public static final String KEY_USE_SPI_CRC = "use_spi_crc";
	public static final String KEY_SWITCH_STORAGE = "switch_storage";
	public static final String KEY_ENABLE_ANAGAIN3 = "enable_anagain3";
	public static final String KEY_ENABLE_HSLDIGGAIN = "enable_hsldiggain";
	public static final String KEY_ENABLE_HSRDIGGAIN = "enable_hsrdiggain";
	public static final String KEY_ENABLE_HSLOWPOW = "enable_hslowpow";
	public static final String KEY_ENABLE_HSDACLOWPOW = "enable_hsdaclowpow";
	public static final String KEY_ENABLE_HSHPEN = "enable_hshpen";
	public static final String KEY_ENABLE_CLASSDHPG = "enable_classdhpg";
	public static final String KEY_ENABLE_CLASSDWG = "enable_classdwg";
	public static final String KEY_ENABLE_ADDIGGAIN2 = "enable_addiggain2";
	public static final String KEY_ENABLE_EARDIGGAIN = "enable_eardiggain";
	public static final String KEY_ANAGAIN3_CONTROL = "anagain3_control";
	public static final String KEY_USE_WIFIPM_MAX = "use_wifipm_max";
	public static final String KEY_SCHED_MC = "sched_mc";
	public static final String KEY_DISABLE_BLN = "disable_bln";
	
	public static final String SELECTION = "selection";
	ListView settingsList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_device_settings);
		settingsList = (ListView) findViewById(R.id.settingsList);
		settingsList.setOnItemClickListener(this);
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onItemClick(AdapterView<?> adapter, View view, int index, long arg3) {
		Intent intent = new Intent(this, ContainerActivity.class);
		intent.putExtra(SELECTION, index);			
		startActivity(intent);		
	}

}
