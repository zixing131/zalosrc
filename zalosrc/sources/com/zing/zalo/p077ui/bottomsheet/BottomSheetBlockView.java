package com.zing.zalo.p077ui.bottomsheet;

import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes5.dex */
public final class BottomSheetBlockView extends ZdsModalBottomSheet {
    public static final C11168a Companion = new C11168a(null);

    /* renamed from: com.zing.zalo.ui.bottomsheet.BottomSheetBlockView$a */
    /* loaded from: classes5.dex */
    public static final class C11168a {
        private C11168a() {
        }

        public /* synthetic */ C11168a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.bottomsheet.BottomSheetBlockView$b */
    /* loaded from: classes5.dex */
    public static final class EnumC11169b extends Enum {

        /* renamed from: q */
        public static final EnumC11169b f56202q = new EnumC11169b("CHAT", 0, 1);

        /* renamed from: r */
        public static final EnumC11169b f56203r = new EnumC11169b("CONTACT_LIST", 1, 2);

        /* renamed from: s */
        public static final EnumC11169b f56204s = new EnumC11169b("PROFILE_STRANGER", 2, 3);

        /* renamed from: t */
        public static final EnumC11169b f56205t = new EnumC11169b("TAB_MSG", 3, 4);

        /* renamed from: u */
        public static final EnumC11169b f56206u = new EnumC11169b("MINI_PROFILE", 4, 5);

        /* renamed from: v */
        public static final EnumC11169b f56207v = new EnumC11169b("DEFAULT", 5, 0);

        /* renamed from: w */
        private static final /* synthetic */ EnumC11169b[] f56208w;

        /* renamed from: x */
        private static final /* synthetic */ InterfaceC30165a f56209x;

        /* renamed from: p */
        private final int f56210p;

        static {
            EnumC11169b[] m58495b = m58495b();
            f56208w = m58495b;
            f56209x = AbstractC30166b.m148796a(m58495b);
        }

        private EnumC11169b(String str, int i11, int i12) {
            super(str, i11);
            this.f56210p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC11169b[] m58495b() {
            return new EnumC11169b[]{f56202q, f56203r, f56204s, f56205t, f56206u, f56207v};
        }

        public static EnumC11169b valueOf(String str) {
            return (EnumC11169b) Enum.valueOf(EnumC11169b.class, str);
        }

        public static EnumC11169b[] values() {
            return (EnumC11169b[]) f56208w.clone();
        }

        /* renamed from: c */
        public final int m58496c() {
            return this.f56210p;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new BlockViewBottomSheet();
    }
}
