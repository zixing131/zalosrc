package com.zing.zalo.plugin;

import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public interface IBinaryZalo extends IInterface {
    public static final String DESCRIPTOR = "com.zing.zalo.plugin.IBinaryZalo";

    void mer(IRemoteServiceRequestCallback iRemoteServiceRequestCallback, String str, String str2, String str3, String[] strArr, String[] strArr2) throws RemoteException;

    String mgcl() throws RemoteException;

    String mgcp() throws RemoteException;

    boolean milo() throws RemoteException;

    int mop(int i11, int i12) throws RemoteException;

    void msn(IRemoteServiceRequestCallback iRemoteServiceRequestCallback, String str, String str2, String str3) throws RemoteException;
}
