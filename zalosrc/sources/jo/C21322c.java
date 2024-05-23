package jo;

import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleDataPhotoViewfull;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleDataPrivacyQuickSetting;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import io.C20637a;
import io.C20638b;
import java.util.List;

/* renamed from: jo.c */
/* loaded from: classes4.dex */
public final class C21322c implements InterfaceC21320a {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static volatile C21322c f103820b;

    /* renamed from: a */
    private final InterfaceC21320a f103821a;

    /* renamed from: jo.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C21322c m110410a() {
            C21322c c21322c = C21322c.f103820b;
            if (c21322c == null) {
                synchronized (this) {
                    c21322c = new C21322c(new C21321b());
                    C21322c.f103820b = c21322c;
                }
            }
            return c21322c;
        }
    }

    public C21322c(InterfaceC21320a interfaceC21320a) {
        AbstractC19074t.m100208f(interfaceC21320a, "dataSource");
        this.f103821a = interfaceC21320a;
    }

    /* renamed from: n */
    public static final C21322c m110409n() {
        return Companion.m110410a();
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: a */
    public List mo110388a(BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull) {
        AbstractC19074t.m100208f(bottomSheetMenuBundleDataPhotoViewfull, "data");
        return this.f103821a.mo110388a(bottomSheetMenuBundleDataPhotoViewfull);
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: b */
    public List mo110389b(C3000l0 c3000l0, String str, boolean z11) {
        return this.f103821a.mo110389b(c3000l0, str, z11);
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: c */
    public List mo110390c(C20638b c20638b) {
        AbstractC19074t.m100208f(c20638b, "dataStoryViewFull");
        return this.f103821a.mo110390c(c20638b);
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: d */
    public List mo110391d(C3020p0 c3020p0, boolean z11, boolean z12, boolean z13, int i11) {
        return this.f103821a.mo110391d(c3020p0, z11, z12, z13, i11);
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: e */
    public List mo110392e(C3020p0 c3020p0) {
        return this.f103821a.mo110392e(c3020p0);
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: f */
    public List mo110393f() {
        return this.f103821a.mo110393f();
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: g */
    public List mo110394g(BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull) {
        AbstractC19074t.m100208f(bottomSheetMenuBundleDataPhotoViewfull, "data");
        return this.f103821a.mo110394g(bottomSheetMenuBundleDataPhotoViewfull);
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: h */
    public List mo110395h(C20637a c20637a) {
        AbstractC19074t.m100208f(c20637a, "data");
        return this.f103821a.mo110395h(c20637a);
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: i */
    public List mo110396i(BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull) {
        AbstractC19074t.m100208f(bottomSheetMenuBundleDataPhotoViewfull, "data");
        return this.f103821a.mo110396i(bottomSheetMenuBundleDataPhotoViewfull);
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: j */
    public List mo110397j(BottomSheetMenuBundleDataPrivacyQuickSetting bottomSheetMenuBundleDataPrivacyQuickSetting) {
        AbstractC19074t.m100208f(bottomSheetMenuBundleDataPrivacyQuickSetting, "data");
        return this.f103821a.mo110397j(bottomSheetMenuBundleDataPrivacyQuickSetting);
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: k */
    public List mo110398k(C3020p0 c3020p0, boolean z11) {
        return this.f103821a.mo110398k(c3020p0, z11);
    }
}
