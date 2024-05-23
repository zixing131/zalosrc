package p555uq;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.work.AbstractC2144f;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import hm0.C20096c;
import is.AbstractC20826v0;
import me0.AbstractC23136l9;
import mw.C23459d;
import od0.InterfaceC24223a;
import org.json.JSONObject;
import p185gc.AbstractC19383g;
import p302ko.C21785g;
import p348mi.AbstractC23304d;
import p363nh.C23744a;
import pd0.C24730d;
import pd0.EnumC24734h;

/* renamed from: uq.a */
/* loaded from: classes4.dex */
public final class C27357a extends AbstractC19383g {

    /* renamed from: a */
    private final C21785g f128878a;

    /* renamed from: uq.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f128879a;

        /* renamed from: b */
        private final boolean f128880b;

        /* renamed from: c */
        private final String f128881c;

        /* renamed from: d */
        private final TrackingSource f128882d;

        /* renamed from: e */
        private final boolean f128883e;

        public a(String str, boolean z11, String str2, TrackingSource trackingSource, boolean z12) {
            AbstractC19074t.m100208f(str, "path");
            AbstractC19074t.m100208f(str2, "cameraLog");
            this.f128879a = str;
            this.f128880b = z11;
            this.f128881c = str2;
            this.f128882d = trackingSource;
            this.f128883e = z12;
        }

        /* renamed from: a */
        public final String m140152a() {
            return this.f128881c;
        }

        /* renamed from: b */
        public final String m140153b() {
            return this.f128879a;
        }

        /* renamed from: c */
        public final boolean m140154c() {
            return this.f128880b;
        }

        /* renamed from: d */
        public final TrackingSource m140155d() {
            return this.f128882d;
        }

        /* renamed from: e */
        public final boolean m140156e() {
            return this.f128883e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f128879a, aVar.f128879a) && this.f128880b == aVar.f128880b && AbstractC19074t.m100204b(this.f128881c, aVar.f128881c) && AbstractC19074t.m100204b(this.f128882d, aVar.f128882d) && this.f128883e == aVar.f128883e;
        }

        public int hashCode() {
            int hashCode = ((((this.f128879a.hashCode() * 31) + AbstractC2144f.m11520a(this.f128880b)) * 31) + this.f128881c.hashCode()) * 31;
            TrackingSource trackingSource = this.f128882d;
            return ((hashCode + (trackingSource == null ? 0 : trackingSource.hashCode())) * 31) + AbstractC2144f.m11520a(this.f128883e);
        }

        public String toString() {
            return "Params(path=" + this.f128879a + ", pushFeed=" + this.f128880b + ", cameraLog=" + this.f128881c + ", trackingSourceUpdateAvatar=" + this.f128882d + ", isFromMiniApp=" + this.f128883e + ")";
        }
    }

    /* renamed from: uq.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC24223a {

        /* renamed from: b */
        final /* synthetic */ a f128885b;

        b(a aVar) {
            this.f128885b = aVar;
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: a */
        public void mo50006a(Intent intent) {
            AbstractC19074t.m100208f(intent, "intent");
            String stringExtra = intent.getStringExtra("urlUploaded");
            String stringExtra2 = intent.getStringExtra("picId");
            C27357a.this.m140151d(stringExtra);
            boolean m140156e = this.f128885b.m140156e();
            if (m140156e) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_updateAvtSuccess));
            }
            C23744a.Companion.m124119a().m124116d(15000, stringExtra, stringExtra2, Boolean.valueOf(!m140156e));
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: b */
        public void mo50007b(String str) {
            Snackbar snackbar;
            View m92656bJ;
            AbstractC19074t.m100208f(str, "errorText");
            boolean m140156e = this.f128885b.m140156e();
            if (m140156e) {
                ZaloView m123164c = C23459d.f113954a.m123164c();
                if (m123164c != null && (m92656bJ = m123164c.m92656bJ()) != null) {
                    snackbar = AbstractC20826v0.m108786T0(m92656bJ, str, 3000);
                } else {
                    snackbar = null;
                }
                if (snackbar == null) {
                    ToastUtils.showMess(str);
                }
            }
            C23744a.Companion.m124119a().m124116d(15001, str, Boolean.valueOf(!m140156e));
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: c */
        public void mo50008c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            boolean m140156e = this.f128885b.m140156e();
            if (m140156e) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_updateAvtFail));
            }
            C23744a.Companion.m124119a().m124116d(15001, Boolean.valueOf(!m140156e));
        }
    }

    public C27357a(C21785g c21785g) {
        AbstractC19074t.m100208f(c21785g, "repo");
        this.f128878a = c21785g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        C24730d.m128465h().m128478q(aVar.m140153b(), aVar.m140154c(), EnumC24734h.AVATAR, 0, false, aVar.m140152a(), aVar.m140155d(), new b(aVar));
    }

    /* renamed from: d */
    public final void m140151d(String str) {
        String mo112408h0 = this.f128878a.mo112408h0();
        if (!TextUtils.isEmpty(mo112408h0)) {
            try {
                JSONObject jSONObject = new JSONObject(mo112408h0);
                jSONObject.put("is_set_avatar", true);
                this.f128878a.mo112390K(jSONObject);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        String mo112386A = this.f128878a.mo112386A();
        if (!TextUtils.isEmpty(mo112386A)) {
            try {
                JSONObject jSONObject2 = new JSONObject(mo112386A);
                jSONObject2.put("needUpdateInfo", 0);
                this.f128878a.mo112392M(jSONObject2);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        contactProfile.f42446v = str;
        contactProfile.f42323A1 = str;
        try {
            C21785g c21785g = this.f128878a;
            String m40373K = contactProfile.m40373K();
            AbstractC19074t.m100207e(m40373K, "getContent(...)");
            c21785g.mo112406d(m40373K);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }
}
