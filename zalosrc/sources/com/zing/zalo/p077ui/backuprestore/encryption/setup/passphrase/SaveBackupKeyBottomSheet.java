package com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase;

import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;
import java.util.NoSuchElementException;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes5.dex */
public final class SaveBackupKeyBottomSheet extends ZdsModalBottomSheet {
    public static final C11041a Companion = new C11041a(null);

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.SaveBackupKeyBottomSheet$a */
    /* loaded from: classes5.dex */
    public static final class C11041a {
        private C11041a() {
        }

        public /* synthetic */ C11041a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.SaveBackupKeyBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class EnumC11042b extends Enum {
        public static final a Companion;

        /* renamed from: q */
        public static final EnumC11042b f55720q = new EnumC11042b(Image.SCALE_TYPE_NONE, 0, -1);

        /* renamed from: r */
        public static final EnumC11042b f55721r = new EnumC11042b("DRIVE", 1, 0);

        /* renamed from: s */
        public static final EnumC11042b f55722s = new EnumC11042b("COPY", 2, 1);

        /* renamed from: t */
        private static final /* synthetic */ EnumC11042b[] f55723t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f55724u;

        /* renamed from: p */
        private final int f55725p;

        /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.SaveBackupKeyBottomSheet$b$a */
        /* loaded from: classes5.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final EnumC11042b m57649a(int i11) {
                for (EnumC11042b enumC11042b : EnumC11042b.values()) {
                    if (enumC11042b.m57648c() == i11) {
                        return enumC11042b;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        static {
            EnumC11042b[] m57647b = m57647b();
            f55723t = m57647b;
            f55724u = AbstractC30166b.m148796a(m57647b);
            Companion = new a(null);
        }

        private EnumC11042b(String str, int i11, int i12) {
            super(str, i11);
            this.f55725p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC11042b[] m57647b() {
            return new EnumC11042b[]{f55720q, f55721r, f55722s};
        }

        public static EnumC11042b valueOf(String str) {
            return (EnumC11042b) Enum.valueOf(EnumC11042b.class, str);
        }

        public static EnumC11042b[] values() {
            return (EnumC11042b[]) f55723t.clone();
        }

        /* renamed from: c */
        public final int m57648c() {
            return this.f55725p;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new SaveBackupKeyBS();
    }
}
