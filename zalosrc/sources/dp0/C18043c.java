package dp0;

import android.app.Activity;
import android.app.KeyguardManager;
import android.os.Build;
import android.view.Window;
import p173fz.C19172a;

/* renamed from: dp0.c */
/* loaded from: classes7.dex */
public class C18043c extends AbstractC18044d {

    /* renamed from: a */
    private Window f91326a;

    /* renamed from: b */
    private KeyguardManager f91327b;

    /* renamed from: e */
    private static boolean m95908e() {
        int i11 = Build.VERSION.SDK_INT;
        return i11 >= 23 && i11 <= 25;
    }

    @Override // dp0.AbstractC18044d
    /* renamed from: b */
    public void mo95909b(Activity activity) {
        if (C19172a.m100599j("features@voip@replace_deprecated_show_on_locked") == 1 && Build.VERSION.SDK_INT >= 27) {
            activity.setShowWhenLocked(true);
            activity.setTurnScreenOn(true);
            return;
        }
        this.f91326a = activity.getWindow();
        this.f91327b = (KeyguardManager) activity.getSystemService("keyguard");
        this.f91326a.setFlags(524288, 524288);
        this.f91326a.setFlags(2097152, 2097152);
        this.f91326a.setFlags(128, 128);
        if (m95908e()) {
            this.f91326a.setFlags(4194304, 4194304);
        }
    }

    @Override // dp0.AbstractC18044d
    /* renamed from: c */
    public void mo95910c() {
        KeyguardManager keyguardManager = this.f91327b;
        if (keyguardManager != null && this.f91326a != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
            this.f91326a.clearFlags(524288);
            this.f91326a.clearFlags(2097152);
            this.f91326a.clearFlags(128);
            if (m95908e()) {
                this.f91326a.clearFlags(4194304);
            }
        }
    }

    @Override // dp0.AbstractC18044d
    /* renamed from: d */
    public void mo95911d() {
        Window window = this.f91326a;
        if (window == null) {
            return;
        }
        int i11 = window.getAttributes().flags;
        if ((i11 & 524288) == 0) {
            this.f91326a.setFlags(524288, 524288);
        }
        if ((i11 & 2097152) == 0) {
            this.f91326a.setFlags(2097152, 2097152);
        }
        if ((i11 & 128) == 0) {
            this.f91326a.setFlags(128, 128);
        }
        if (m95908e() && (i11 & 4194304) == 0) {
            this.f91326a.setFlags(4194304, 4194304);
        }
    }
}
