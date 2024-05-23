package com.zing.zalo.p077ui.backuprestore.encryption.verification.pin;

import android.os.Bundle;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.b */
/* loaded from: classes5.dex */
public final class C11107b implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final b f55923a;

    /* renamed from: b */
    private final Integer f55924b;

    /* renamed from: c */
    private final TargetBackupInfo f55925c;

    /* renamed from: d */
    private final boolean f55926d;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C11107b m57971a(Bundle bundle) {
            Integer num = null;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("KEY_TRACKING_FLOW_PIN", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            b valueOf = b.valueOf(string);
            int i11 = bundle.getInt("extra_entry_point", -1);
            if (i11 != -1) {
                num = Integer.valueOf(i11);
            }
            return new C11107b(valueOf, num, (TargetBackupInfo) bundle.getParcelable("extra_target_backup_info"), bundle.getBoolean("ARG_IS_NEED_RESTORE_ZCLOUD_BACKUP"));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.b$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f55927p = new b("CLOUD_RESTORE", 0);

        /* renamed from: q */
        public static final b f55928q = new b("CLOUD_RESTORE_FROM_TAB_ME", 1);

        /* renamed from: r */
        public static final b f55929r = new b("NORMAL_RESTORE", 2);

        /* renamed from: s */
        public static final b f55930s = new b("VERIFY_CLOUD_ONBOARDING_SETUP", 3);

        /* renamed from: t */
        public static final b f55931t = new b("EMPTY_BACKUP_INFO", 4);

        /* renamed from: u */
        public static final b f55932u = new b("CHANGE_PROTECT_CODE", 5);

        /* renamed from: v */
        public static final b f55933v = new b("BACKUP_DETAIL", 6);

        /* renamed from: w */
        private static final /* synthetic */ b[] f55934w;

        /* renamed from: x */
        private static final /* synthetic */ InterfaceC30165a f55935x;

        static {
            b[] m57972b = m57972b();
            f55934w = m57972b;
            f55935x = AbstractC30166b.m148796a(m57972b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m57972b() {
            return new b[]{f55927p, f55928q, f55929r, f55930s, f55931t, f55932u, f55933v};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f55934w.clone();
        }
    }

    public C11107b(b bVar, Integer num, TargetBackupInfo targetBackupInfo, boolean z11) {
        AbstractC19074t.m100208f(bVar, "fromFlow");
        this.f55923a = bVar;
        this.f55924b = num;
        this.f55925c = targetBackupInfo;
        this.f55926d = z11;
    }

    /* renamed from: a */
    public final b m57968a() {
        return this.f55923a;
    }

    /* renamed from: b */
    public final TargetBackupInfo m57969b() {
        return this.f55925c;
    }

    /* renamed from: c */
    public final boolean m57970c() {
        return this.f55926d;
    }
}
