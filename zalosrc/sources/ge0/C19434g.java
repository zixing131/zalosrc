package ge0;

import android.os.Bundle;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19074t;
import p185gc.AbstractC19383g;
import p322lf.AbstractC22470k;
import p542ub.InterfaceC27218a;

/* renamed from: ge0.g */
/* loaded from: classes4.dex */
public final class C19434g extends AbstractC19383g {

    /* renamed from: ge0.g$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final InterfaceC27218a f96401a;

        /* renamed from: b */
        private final int f96402b;

        /* renamed from: c */
        private final int f96403c;

        /* renamed from: d */
        private final CameraInputParams f96404d;

        /* renamed from: e */
        private final Bundle f96405e;

        public a(InterfaceC27218a interfaceC27218a, int i11, int i12, CameraInputParams cameraInputParams, Bundle bundle) {
            AbstractC19074t.m100208f(cameraInputParams, "inputParams");
            this.f96401a = interfaceC27218a;
            this.f96402b = i11;
            this.f96403c = i12;
            this.f96404d = cameraInputParams;
            this.f96405e = bundle;
        }

        /* renamed from: a */
        public final int m101593a() {
            return this.f96403c;
        }

        /* renamed from: b */
        public final Bundle m101594b() {
            return this.f96405e;
        }

        /* renamed from: c */
        public final CameraInputParams m101595c() {
            return this.f96404d;
        }

        /* renamed from: d */
        public final int m101596d() {
            return this.f96402b;
        }

        /* renamed from: e */
        public final InterfaceC27218a m101597e() {
            return this.f96401a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f96401a, aVar.f96401a) && this.f96402b == aVar.f96402b && this.f96403c == aVar.f96403c && AbstractC19074t.m100204b(this.f96404d, aVar.f96404d) && AbstractC19074t.m100204b(this.f96405e, aVar.f96405e);
        }

        public int hashCode() {
            InterfaceC27218a interfaceC27218a = this.f96401a;
            int hashCode = (((((((interfaceC27218a == null ? 0 : interfaceC27218a.hashCode()) * 31) + this.f96402b) * 31) + this.f96403c) * 31) + this.f96404d.hashCode()) * 31;
            Bundle bundle = this.f96405e;
            return hashCode + (bundle != null ? bundle.hashCode() : 0);
        }

        public String toString() {
            return "Param(zaloActivity=" + this.f96401a + ", requestCode=" + this.f96402b + ", animation=" + this.f96403c + ", inputParams=" + this.f96404d + ", extraBundle=" + this.f96405e + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        C17487o0 c17487o0;
        boolean z11;
        AbstractC19074t.m100208f(aVar, "params");
        InterfaceC27218a m101597e = aVar.m101597e();
        if (m101597e != null) {
            c17487o0 = m101597e.mo35579p();
        } else {
            c17487o0 = null;
        }
        if (c17487o0 == null) {
            return;
        }
        if (AbstractC22470k.m116164p(aVar.m101595c().f41129s, 4, 5) && (!AbstractC22470k.m116151c() || AbstractC22470k.m116161m())) {
            ToastUtils.showMess(aVar.m101597e().getContext().getString(AbstractC8020f0.connect_camera_error));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_input_params", aVar.m101595c());
        if (aVar.m101594b() != null) {
            bundle.putAll(aVar.m101594b());
        }
        if (AbstractC22470k.m116164p(aVar.m101595c().f41129s, 4, 5) && aVar.m101595c().f41121n0 && aVar.m101594b() != null && aVar.m101594b().containsKey("extra_input_contact_profile")) {
            z11 = true;
        } else {
            z11 = false;
        }
        bundle.putBoolean("BUNDLE_FORCE_OPEN_MAIN_APP", z11);
        aVar.m101597e().mo35579p().mo89694j2(ZaloCameraView.class, bundle, aVar.m101596d(), "ZaloCameraView", aVar.m101593a(), true);
    }
}
