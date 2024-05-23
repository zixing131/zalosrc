package com.zing.zalo.backuprestore.service;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.AbstractC1364q;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zalocloud.home.ZCloudHomeView;
import gu.AbstractC19601a;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import p320ld.C22438j;
import p363nh.C23750d;
import p479rc.C25727d;
import sc.C26220b;

/* loaded from: classes3.dex */
public class BackupRestoreService extends Service {

    /* renamed from: p */
    private static volatile boolean f40045p = false;

    /* renamed from: a */
    public static boolean m37270a() {
        return f40045p;
    }

    /* renamed from: b */
    private void m37271b(String str) {
        Intent m119020S;
        try {
            C26220b.m134823f("SMLBackupRestoreService", "startService(" + str + ")");
            C23750d c23750d = new C23750d(getApplicationContext());
            if (C25727d.m132733Y()) {
                c23750d.mo6895w(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_change_pass_progressing), ""));
                c23750d.mo6894v("");
                m119020S = AbstractC23152n3.m119020S(ZCloudHomeView.class, null, true);
            } else if ("PC_TRANSFER".equals(str)) {
                String string = MainApplication.getAppContext().getString(AbstractC8020f0.transfer_message_in_progress);
                c23750d.m6869V(new AbstractC1364q.d().m6828h(string));
                c23750d.mo6894v(string);
                c23750d.mo6895w(MainApplication.getAppContext().getString(AbstractC8020f0.transfer_message_title));
                m119020S = AbstractC23152n3.m119020S(MainTabView.class, null, true);
            } else {
                c23750d.mo6895w(AbstractC23136l9.m118743r0(AbstractC8020f0.str_syncmes_sync_header_title));
                c23750d.mo6894v(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sycn_retrieving_mes));
                m119020S = AbstractC23152n3.m119020S(C22438j.m115945l(), null, true);
            }
            c23750d.mo6860M(true);
            c23750d.m6893u(PendingIntent.getActivity(MainApplication.getAppContext(), 0, m119020S, AbstractC19601a.m102572b(1073741824)));
            c23750d.m6863P(0, 0, true);
            c23750d.m124165v0("db");
            if (Build.VERSION.SDK_INT >= 29) {
                c23750d.m124149d0(this, 1);
            } else {
                c23750d.m124148c0(this);
            }
            f40045p = true;
            C26220b.m134823f("SMLBackupRestoreService", "startService(): DONE");
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreService", e11);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        f40045p = false;
        C26220b.m134823f("SMLBackupRestoreService", "onDestroy()");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        C26220b.m134823f("SMLBackupRestoreService", "onStartCommand(): intent=" + intent + ", flags=" + i11 + ", startId=" + i12);
        if (intent != null) {
            String stringExtra = intent.getStringExtra("extra_queue");
            if ("com.zing.zalo.intent.action.START_BACKUP_SERVICE_FOREGROUND".equals(intent.getAction())) {
                m37271b(stringExtra);
                return 2;
            }
            return 2;
        }
        return 2;
    }
}
