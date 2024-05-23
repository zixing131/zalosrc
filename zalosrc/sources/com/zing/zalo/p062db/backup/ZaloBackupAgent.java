package com.zing.zalo.p062db.backup;

import ag0.AbstractC0837p0;
import android.app.backup.BackupAgent;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import bm.RunnableC2846d;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23309i;

/* loaded from: classes3.dex */
public class ZaloBackupAgent extends BackupAgent {

    /* renamed from: a */
    String f43223a = "";

    @Override // android.app.backup.BackupAgent
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
    }

    @Override // android.app.backup.BackupAgent
    public void onCreate() {
        super.onCreate();
        this.f43223a = AbstractC23309i.m121662Z0(getApplicationContext());
    }

    @Override // android.app.backup.BackupAgent
    public void onRestore(BackupDataInput backupDataInput, int i11, ParcelFileDescriptor parcelFileDescriptor) {
    }

    @Override // android.app.backup.BackupAgent
    public void onRestoreFinished() {
        super.onRestoreFinished();
        if (!TextUtils.isEmpty(this.f43223a)) {
            AbstractC20887g.m109229g(123201, 0, "");
        } else if (TextUtils.isEmpty(AbstractC23309i.m121662Z0(getApplicationContext()))) {
            AbstractC20887g.m109229g(123202, 0, "");
        } else {
            AbstractC20887g.m109229g(123200, 0, "");
        }
        AbstractC0837p0.m2225f().mo2040a(new RunnableC2846d());
    }
}
