package com.zing.zalo.p077ui.zalocloud.restore;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: com.zing.zalo.ui.zalocloud.restore.c */
/* loaded from: classes6.dex */
public final class C13958c implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final b f71923a;

    /* renamed from: com.zing.zalo.ui.zalocloud.restore.c$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bundle m77719a(b bVar) {
            AbstractC19074t.m100208f(bVar, "trackingFlow");
            Bundle bundle = new Bundle();
            bundle.putString("KEY_TRACKING_FLOW_PIN", bVar.name());
            return bundle;
        }

        /* renamed from: b */
        public final C13958c m77720b(Bundle bundle) {
            if (bundle != null) {
                String string = bundle.getString("KEY_TRACKING_FLOW_PIN", "");
                AbstractC19074t.m100207e(string, "getString(...)");
                return new C13958c(b.valueOf(string));
            }
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.zalocloud.restore.c$b */
    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f71924p = new b("AFTER_LOGIN", 0);

        /* renamed from: q */
        public static final b f71925q = new b("TAB_ME", 1);

        /* renamed from: r */
        public static final b f71926r = new b("FIXED_BANNER", 2);

        /* renamed from: s */
        public static final b f71927s = new b("BACKUP_DETAIL", 3);

        /* renamed from: t */
        public static final b f71928t = new b("SETTING", 4);

        /* renamed from: u */
        private static final /* synthetic */ b[] f71929u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f71930v;

        static {
            b[] m77721b = m77721b();
            f71929u = m77721b;
            f71930v = AbstractC30166b.m148796a(m77721b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m77721b() {
            return new b[]{f71924p, f71925q, f71926r, f71927s, f71928t};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f71929u.clone();
        }
    }

    public C13958c(b bVar) {
        AbstractC19074t.m100208f(bVar, "trackingFlow");
        this.f71923a = bVar;
    }

    /* renamed from: a */
    public final b m77718a() {
        return this.f71923a;
    }
}
