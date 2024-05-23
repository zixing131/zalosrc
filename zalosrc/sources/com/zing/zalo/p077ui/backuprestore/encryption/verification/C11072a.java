package com.zing.zalo.p077ui.backuprestore.encryption.verification;

import android.os.Bundle;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.a */
/* loaded from: classes5.dex */
public final class C11072a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final b f55806a;

    /* renamed from: b */
    private final Integer f55807b;

    /* renamed from: c */
    private final TargetBackupInfo f55808c;

    /* renamed from: d */
    private final boolean f55809d;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C11072a m57783a(Bundle bundle) {
            Integer num = null;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("KEY_TRACKING_FLOW_PICK_TYPE_VERIFY", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            b valueOf = b.valueOf(string);
            int i11 = bundle.getInt("extra_entry_point", -1);
            if (i11 != -1) {
                num = Integer.valueOf(i11);
            }
            return new C11072a(valueOf, num, (TargetBackupInfo) bundle.getParcelable("extra_target_backup_info"), bundle.getBoolean("ARG_IS_NEED_RESTORE_ZCLOUD_BACKUP"));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.a$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f55810p = new b("CLOUD_RESTORE", 0);

        /* renamed from: q */
        public static final b f55811q = new b("CLOUD_RESTORE_FROM_TAB_ME", 1);

        /* renamed from: r */
        public static final b f55812r = new b("NORMAL_RESTORE", 2);

        /* renamed from: s */
        public static final b f55813s = new b("VERIFY_CLOUD_ONBOARDING_SETUP", 3);

        /* renamed from: t */
        public static final b f55814t = new b("EMPTY_BACKUP_INFO", 4);

        /* renamed from: u */
        public static final b f55815u = new b("BACKUP_DETAIL", 5);

        /* renamed from: v */
        public static final b f55816v = new b("CHANGE_PROTECT_CODE", 6);

        /* renamed from: w */
        private static final /* synthetic */ b[] f55817w;

        /* renamed from: x */
        private static final /* synthetic */ InterfaceC30165a f55818x;

        static {
            b[] m57784b = m57784b();
            f55817w = m57784b;
            f55818x = AbstractC30166b.m148796a(m57784b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m57784b() {
            return new b[]{f55810p, f55811q, f55812r, f55813s, f55814t, f55815u, f55816v};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f55817w.clone();
        }
    }

    public C11072a(b bVar, Integer num, TargetBackupInfo targetBackupInfo, boolean z11) {
        AbstractC19074t.m100208f(bVar, "fromFlow");
        this.f55806a = bVar;
        this.f55807b = num;
        this.f55808c = targetBackupInfo;
        this.f55809d = z11;
    }

    /* renamed from: a */
    public final b m57780a() {
        return this.f55806a;
    }

    /* renamed from: b */
    public final TargetBackupInfo m57781b() {
        return this.f55808c;
    }

    /* renamed from: c */
    public final boolean m57782c() {
        return this.f55809d;
    }
}
