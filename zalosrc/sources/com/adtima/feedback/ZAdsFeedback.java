package com.adtima.feedback;

import android.content.Context;
import com.adtima.Adtima;
import p227i3.C20207k;

/* loaded from: classes2.dex */
public final class ZAdsFeedback {
    private static final String TAG = "ZAdsFeedback";
    private static ZAdsFeedback mInstance;
    private Context mContext;

    private ZAdsFeedback() {
        this.mContext = null;
        this.mContext = Adtima.SharedContext;
    }

    public static ZAdsFeedback getInstance() {
        if (mInstance == null) {
            mInstance = new ZAdsFeedback();
        }
        return mInstance;
    }

    public void getAdsFeedback(ZAdsFeedbackListener zAdsFeedbackListener) {
        try {
            C20207k.m105398c(this.mContext).m105401e(Adtima.SDK_VERSION_CODE, zAdsFeedbackListener);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "fetchAdsFeedback", e11);
        }
    }

    public void getAdsFeedbackLanding(ZAdsFeedbackListener zAdsFeedbackListener) {
        try {
            C20207k.m105398c(this.mContext).m105401e(Adtima.SDK_VERSION_CODE, zAdsFeedbackListener);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "fetchAdsFeedback", e11);
        }
    }
}
