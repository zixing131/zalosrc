package ge0;

import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import fn0.AbstractC19074t;
import ge0.C19433f;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.List;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p185gc.AbstractC19383g;
import p542ub.InterfaceC27218a;

/* renamed from: ge0.f */
/* loaded from: classes4.dex */
public final class C19433f extends AbstractC19383g {

    /* renamed from: ge0.f$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final InterfaceC27218a f96396a;

        /* renamed from: b */
        private final String f96397b;

        /* renamed from: c */
        private final List f96398c;

        /* renamed from: d */
        private final String f96399d;

        /* renamed from: e */
        private final String f96400e;

        public a(InterfaceC27218a interfaceC27218a, String str, List list, String str2, String str3) {
            AbstractC19074t.m100208f(list, "savedPaths");
            this.f96396a = interfaceC27218a;
            this.f96397b = str;
            this.f96398c = list;
            this.f96399d = str2;
            this.f96400e = str3;
        }

        /* renamed from: a */
        public final InterfaceC27218a m101587a() {
            return this.f96396a;
        }

        /* renamed from: b */
        public final String m101588b() {
            return this.f96399d;
        }

        /* renamed from: c */
        public final String m101589c() {
            return this.f96397b;
        }

        /* renamed from: d */
        public final String m101590d() {
            return this.f96400e;
        }

        /* renamed from: e */
        public final List m101591e() {
            return this.f96398c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f96396a, aVar.f96396a) && AbstractC19074t.m100204b(this.f96397b, aVar.f96397b) && AbstractC19074t.m100204b(this.f96398c, aVar.f96398c) && AbstractC19074t.m100204b(this.f96399d, aVar.f96399d) && AbstractC19074t.m100204b(this.f96400e, aVar.f96400e);
        }

        public int hashCode() {
            InterfaceC27218a interfaceC27218a = this.f96396a;
            int hashCode = (interfaceC27218a == null ? 0 : interfaceC27218a.hashCode()) * 31;
            String str = this.f96397b;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f96398c.hashCode()) * 31;
            String str2 = this.f96399d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f96400e;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Param(activity=" + this.f96396a + ", itemData=" + this.f96397b + ", savedPaths=" + this.f96398c + ", callbackId=" + this.f96399d + ", msgError=" + this.f96400e + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m101585e(a aVar, Bundle bundle) {
        AbstractC19074t.m100208f(aVar, "$params");
        AbstractC19074t.m100208f(bundle, "$bundle");
        try {
            aVar.m101587a().mo35579p().m93069k2(UpdateStatusView.class, bundle, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo12006b(final a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        try {
            if (aVar.m101587a() == null) {
                return;
            }
            final Bundle bundle = new Bundle();
            bundle.putStringArrayList("path", new ArrayList<>(aVar.m101591e()));
            if (!TextUtils.isEmpty(aVar.m101589c())) {
                String m101589c = aVar.m101589c();
                AbstractC19074t.m100205c(m101589c);
                JSONObject jSONObject = new JSONObject(m101589c);
                TrackingSource m108802c0 = AbstractC20826v0.m108802c0(jSONObject, null);
                if (m108802c0 != null) {
                    bundle.putString("extra_tracking_source", m108802c0.m40686z());
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("music");
                if (optJSONObject != null) {
                    boolean z11 = true;
                    if (optJSONObject.optInt("openPlaylist", 0) != 1) {
                        z11 = false;
                    }
                    int optInt = optJSONObject.optInt("cate", 0);
                    if (z11) {
                        bundle.putInt("extra_from_feed_remind_media_type", 3);
                        bundle.putInt("EXTRA_PARAM_CATE_FOCUS", optInt);
                    }
                }
                String optString = jSONObject.optString("status");
                if (!TextUtils.isEmpty(optString)) {
                    bundle.putString("status", optString);
                }
            }
            if (!TextUtils.isEmpty(aVar.m101590d())) {
                bundle.putString("EXTRA_MSG_DOWNLOAD_ERROR", aVar.m101590d());
            }
            bundle.putString("EXTRA_POST_FEED_CALLBACK_ID", aVar.m101588b());
            aVar.m101587a().runOnUiThread(new Runnable() { // from class: ge0.e
                @Override // java.lang.Runnable
                public final void run() {
                    C19433f.m101585e(C19433f.a.this, bundle);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
