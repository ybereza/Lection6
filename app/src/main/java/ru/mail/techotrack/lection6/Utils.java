package ru.mail.techotrack.lection6;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
//Код из лекции №5
public class Utils {
	public static int convertPixelsToDp(int px, Context context){
		return (int)convertPixelsToDp((float)px, context);
	}

	public static int convertDpToPixel(int dp, Context context){
		return (int)convertDpToPixel((float)dp, context);
	}

	public static float convertPixelsToDp(float px, Context context){
		Resources resources = context.getResources();
		DisplayMetrics metrics = resources.getDisplayMetrics();
		float dp = px / (metrics.densityDpi / 160f);
		return dp;
	}

	public static float convertDpToPixel(float dp, Context context){
		Resources resources = context.getResources();
		DisplayMetrics metrics = resources.getDisplayMetrics();
		float px = dp * (metrics.densityDpi / 160f);
		return px;
	}
}
