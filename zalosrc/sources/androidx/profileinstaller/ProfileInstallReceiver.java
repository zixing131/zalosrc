package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.AbstractC1854j;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    /* loaded from: classes.dex */
    public class C1841a implements AbstractC1854j.c {
        C1841a() {
        }

        @Override // androidx.profileinstaller.AbstractC1854j.c
        /* renamed from: a */
        public void mo9515a(int i11, Object obj) {
            AbstractC1854j.f7596b.mo9515a(i11, obj);
            ProfileInstallReceiver.this.setResultCode(i11);
        }

        @Override // androidx.profileinstaller.AbstractC1854j.c
        /* renamed from: b */
        public void mo9516b(int i11, Object obj) {
            AbstractC1854j.f7596b.mo9516b(i11, obj);
        }
    }

    /* renamed from: a */
    static void m9514a(AbstractC1854j.c cVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            Process.sendSignal(Process.myPid(), 10);
            cVar.mo9515a(12, null);
        } else {
            cVar.mo9515a(13, null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC1854j.m9580k(context, new ExecutorC1852h(), new C1841a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    AbstractC1854j.m9581l(context, new ExecutorC1852h(), new C1841a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        AbstractC1854j.m9572c(context, new ExecutorC1852h(), new C1841a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            m9514a(new C1841a());
            return;
        }
        if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            C1841a c1841a = new C1841a();
            if ("DROP_SHADER_CACHE".equals(string2)) {
                AbstractC1845a.m9532b(context, c1841a);
            } else {
                c1841a.mo9515a(16, null);
            }
        }
    }
}
