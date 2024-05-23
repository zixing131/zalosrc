package com.zing.zalo.p077ui.backuprestore.encryption.verification.passphrase;

import android.os.Bundle;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.b */
/* loaded from: classes5.dex */
public final class C11085b implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final b f55856a;

    /* renamed from: b */
    private final Integer f55857b;

    /* renamed from: c */
    private final TargetBackupInfo f55858c;

    /* renamed from: d */
    private final boolean f55859d;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C11085b m57866a(Bundle bundle) {
            Integer num = null;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("KEY_TRACKING_FLOW_PASSPHRASE", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            b valueOf = b.valueOf(string);
            int i11 = bundle.getInt("extra_entry_point", -1);
            if (i11 != -1) {
                num = Integer.valueOf(i11);
            }
            return new C11085b(valueOf, num, (TargetBackupInfo) bundle.getParcelable("extra_target_backup_info"), bundle.getBoolean("ARG_IS_NEED_RESTORE_ZCLOUD_BACKUP"));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.b$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f55860p = new b("CLOUD_RESTORE", 0);

        /* renamed from: q */
        public static final b f55861q = new b("CLOUD_RESTORE_FROM_TAB_ME", 1);

        /* renamed from: r */
        public static final b f55862r = new b("NORMAL_RESTORE", 2);

        /* renamed from: s */
        public static final b f55863s = new b("VERIFY_CLOUD_ONBOARDING_SETUP", 3);

        /* renamed from: t */
        public static final b f55864t = new b("EMPTY_BACKUP_INFO", 4);

        /* renamed from: u */
        public static final b f55865u = new b("CHANGE_PROTECT_CODE", 5);

        /* renamed from: v */
        public static final b f55866v = new b("BACKUP_DETAIL", 6);

        /* renamed from: w */
        private static final /* synthetic */ b[] f55867w;

        /* renamed from: x */
        private static final /* synthetic */ InterfaceC30165a f55868x;

        static {
            b[] m57867b = m57867b();
            f55867w = m57867b;
            f55868x = AbstractC30166b.m148796a(m57867b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m57867b() {
            return new b[]{f55860p, f55861q, f55862r, f55863s, f55864t, f55865u, f55866v};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f55867w.clone();
        }
    }

    public C11085b(b bVar, Integer num, TargetBackupInfo targetBackupInfo, boolean z11) {
        AbstractC19074t.m100208f(bVar, "fromFlow");
        this.f55856a = bVar;
        this.f55857b = num;
        this.f55858c = targetBackupInfo;
        this.f55859d = z11;
    }

    /* renamed from: a */
    public final b m57863a() {
        return this.f55856a;
    }

    /* renamed from: b */
    public final TargetBackupInfo m57864b() {
        return this.f55858c;
    }

    /* renamed from: c */
    public final boolean m57865c() {
        return this.f55859d;
    }
}
