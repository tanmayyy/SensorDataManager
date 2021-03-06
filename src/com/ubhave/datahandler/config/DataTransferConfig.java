package com.ubhave.datahandler.config;

import java.util.HashMap;
import java.util.HashSet;

public class DataTransferConfig
{
	/*
	 * Config Keys
	 */
	public final static String POST_DATA_URL = "dataTargetURL";
	public final static String POST_DATA_URL_PASSWD = "dataTargetURLPasswd";
	public final static String DATA_TRANSER_POLICY = "transferPolicy";
	public final static String CONNECTION_TYPE_FOR_TRANSFER = "connectionTypeForTransfer";
	
	public final static String WAIT_FOR_WIFI_INTERVAL_MILLIS = "DataWaitForWifiInterval";
	public final static String TRANSFER_ALARM_INTERVAL = "DataTransferAlarmInterval";

	/*
	 * Config Values
	 */

//	public final static int STORE_ONLY = 3001;
	public final static int TRANSFER_IMMEDIATE = 3002;
	public final static int TRANSFER_PERIODICALLY = 3003;
//
	public final static int CONNECTION_TYPE_ANY = 4001;
	public final static int CONNECTION_TYPE_WIFI = 4002;

	/*
	 * Default values
	 */
	public final static int DEFAULT_TRANFER_POLICY = TRANSFER_PERIODICALLY;
	public final static int DEFAULT_CONNECTION_TYPE_FOR_TRANSFER = CONNECTION_TYPE_WIFI;
	public final static long DEFAULT_WAIT_FOR_WIFI_INTERVAL = 24 * 60 * 60 * 1000;
	public final static long DEFAULT_TRANSFER_ALARM_INTERVAL = 15 * 60 * 1000;

	public static HashSet<String> validKeys()
	{
		HashSet<String> validKeys = new HashSet<String>();
		validKeys.add(POST_DATA_URL);
		validKeys.add(POST_DATA_URL_PASSWD);
		validKeys.add(DATA_TRANSER_POLICY);
		validKeys.add(CONNECTION_TYPE_FOR_TRANSFER);
		validKeys.add(WAIT_FOR_WIFI_INTERVAL_MILLIS);
		validKeys.add(TRANSFER_ALARM_INTERVAL);
		return validKeys;
	}

	public static HashMap<String, Object> defaultValues()
	{
		HashMap<String, Object> defaults = new HashMap<String, Object>();
		defaults.put(DATA_TRANSER_POLICY, DEFAULT_TRANFER_POLICY);
		defaults.put(CONNECTION_TYPE_FOR_TRANSFER, DEFAULT_CONNECTION_TYPE_FOR_TRANSFER);
		defaults.put(WAIT_FOR_WIFI_INTERVAL_MILLIS, DEFAULT_WAIT_FOR_WIFI_INTERVAL);
		defaults.put(TRANSFER_ALARM_INTERVAL, DEFAULT_TRANSFER_ALARM_INTERVAL);
		return defaults;
	}
}
