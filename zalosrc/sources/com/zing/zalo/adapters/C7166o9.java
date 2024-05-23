package com.zing.zalo.adapters;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;

/* renamed from: com.zing.zalo.adapters.o9 */
/* loaded from: classes3.dex */
public class C7166o9 extends AbstractThreadedSyncAdapter {

    /* renamed from: a */
    private final Context f39240a;

    public C7166o9(Context context, boolean z11) {
        super(context, z11);
        this.f39240a = context;
    }

    @Override // android.content.AbstractThreadedSyncAdapter
    public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
    }
}
