package com.zing.zalo.zalosdk.core.exception;

/* loaded from: classes7.dex */
public class InitializedException extends RuntimeException {
    public InitializedException() {
        super("Missing call ZingAnalyticsManager.getInstance().init(application, appID) in Application ");
    }
}
