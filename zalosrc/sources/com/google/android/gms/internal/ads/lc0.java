package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class lc0 implements DialogInterface.OnClickListener {

    /* renamed from: p */
    final /* synthetic */ String f23813p;

    /* renamed from: q */
    final /* synthetic */ String f23814q;

    /* renamed from: r */
    final /* synthetic */ nc0 f23815r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lc0(nc0 nc0Var, String str, String str2) {
        this.f23815r = nc0Var;
        this.f23813p = str;
        this.f23814q = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        Context context;
        context = this.f23815r.f25127d;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        try {
            String str = this.f23813p;
            String str2 = this.f23814q;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzt.zzp();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f23815r.m25683c("Could not store picture.");
        }
    }
}
