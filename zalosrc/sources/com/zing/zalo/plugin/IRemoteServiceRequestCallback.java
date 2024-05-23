package com.zing.zalo.plugin;

import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public interface IRemoteServiceRequestCallback extends IInterface {
    public static final String DESCRIPTOR = "com.zing.zalo.plugin.IRemoteServiceRequestCallback";

    void onRequestComplete(String str) throws RemoteException;

    void onRequestFailed(String str) throws RemoteException;
}
