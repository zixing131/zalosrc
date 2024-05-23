package com.zing.zalo.feed.utils;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3039t0;
import bo.C3047v0;
import bo.C3051w0;
import bo.C3063z0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.models.ActionDataImageViewer;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.FeedDetailsView;
import com.zing.zalo.p077ui.zviews.ShareProfileView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.uicontrol.MenuListPopupView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i40.C20275e;
import ig0.AbstractC20550a;
import is.AbstractC20814p0;
import is.AbstractC20833z;
import is.C20817r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd0.C21697g;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.C23055e5;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p172fy.C19170a;
import p172fy.C19171b;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p398oo.C24371m0;
import p461qu.AbstractC25495a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p604wb.C28905e;
import p615wn.C29105a;
import p716zh.C31987k4;
import p716zh.C32002l4;
import p716zh.C32092r7;
import p716zh.C32145v4;
import p726zr.C32546b;
import tg.C26663n;
import tr.C26878b;
import v50.C27870vb;
import vg.C28023b6;
import vg.C28202u5;
import vg.C28203u6;
import vg.C28209v3;

/* loaded from: classes4.dex */
public abstract class FeedActionZUtils {

    /* loaded from: classes4.dex */
    public static class ConflictConfirmDialog extends DialogView {

        /* renamed from: H0 */
        ZaloView f47631H0;

        /* renamed from: I0 */
        InterfaceC8902c f47632I0;

        /* renamed from: J0 */
        InterfaceC17463d.d f47633J0 = new C8900a();

        /* renamed from: K0 */
        InterfaceC17463d.d f47634K0 = new C8901b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.feed.utils.FeedActionZUtils$ConflictConfirmDialog$a */
        /* loaded from: classes4.dex */
        public class C8900a implements InterfaceC17463d.d {
            C8900a() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                InterfaceC8902c interfaceC8902c;
                try {
                    if (ConflictConfirmDialog.this.m92642L3().getInt("id") == 1) {
                        if (interfaceC17463d != null) {
                            interfaceC17463d.dismiss();
                        }
                        ConflictConfirmDialog conflictConfirmDialog = ConflictConfirmDialog.this;
                        if (conflictConfirmDialog.f47631H0 != null && (interfaceC8902c = conflictConfirmDialog.f47632I0) != null) {
                            interfaceC8902c.mo47573b();
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.feed.utils.FeedActionZUtils$ConflictConfirmDialog$b */
        /* loaded from: classes4.dex */
        public class C8901b implements InterfaceC17463d.d {
            C8901b() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                InterfaceC8902c interfaceC8902c;
                try {
                    if (ConflictConfirmDialog.this.m92642L3().getInt("id") == 1) {
                        if (interfaceC17463d != null) {
                            interfaceC17463d.dismiss();
                        }
                        ConflictConfirmDialog conflictConfirmDialog = ConflictConfirmDialog.this;
                        if (conflictConfirmDialog.f47631H0 != null && (interfaceC8902c = conflictConfirmDialog.f47632I0) != null) {
                            interfaceC8902c.mo47572a();
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        /* renamed from: com.zing.zalo.feed.utils.FeedActionZUtils$ConflictConfirmDialog$c */
        /* loaded from: classes4.dex */
        public interface InterfaceC8902c {
            /* renamed from: a */
            void mo47572a();

            /* renamed from: b */
            void mo47573b();
        }

        /* renamed from: WK */
        public static ConflictConfirmDialog m47569WK(int i11, ZaloView zaloView, InterfaceC8902c interfaceC8902c) {
            ConflictConfirmDialog conflictConfirmDialog = new ConflictConfirmDialog();
            conflictConfirmDialog.m47571YK(zaloView);
            conflictConfirmDialog.m47570XK(interfaceC8902c);
            Bundle bundle = new Bundle();
            bundle.putInt("id", i11);
            conflictConfirmDialog.mo60305zK(bundle);
            return conflictConfirmDialog;
        }

        @Override // com.zing.zalo.zview.DialogView
        /* renamed from: LK */
        public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
            try {
                if (this.f47631H0 == null || bundle != null) {
                    dismiss();
                    return super.mo13885LK(bundle);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            Context context = getContext();
            if (context == null) {
                context = MainApplication.getAppContext();
            }
            try {
                if (m92642L3().getInt("id") != 1) {
                    return null;
                }
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43159h(5).m43162k(context.getString(AbstractC8020f0.str_conflict_excluded_tag_friends_msg)).m43165n(MainApplication.getAppContext().getString(AbstractC8020f0.str_cancel), this.f47634K0).m43170s(MainApplication.getAppContext().getString(AbstractC8020f0.str_btn_confirm_ok), this.f47633J0);
                return aVar.m43152a();
            } catch (Exception e12) {
                e12.printStackTrace();
                return null;
            }
        }

        @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.e
        /* renamed from: Tv */
        public void mo12457Tv(InterfaceC17463d interfaceC17463d) {
            super.mo12457Tv(interfaceC17463d);
        }

        /* renamed from: XK */
        public void m47570XK(InterfaceC8902c interfaceC8902c) {
            this.f47632I0 = interfaceC8902c;
        }

        /* renamed from: YK */
        public void m47571YK(ZaloView zaloView) {
            this.f47631H0 = zaloView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.utils.FeedActionZUtils$a */
    /* loaded from: classes4.dex */
    public class C8903a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C3020p0 f47637a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC8913k f47638b;

        C8903a(C3020p0 c3020p0, InterfaceC8913k interfaceC8913k) {
            this.f47637a = c3020p0;
            this.f47638b = interfaceC8913k;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                ToastUtils.showMess(c20096c.m104492d());
                this.f47638b.mo47578p2();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONArray jSONArray = ((JSONObject) obj).getJSONObject("data").getJSONArray("list");
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() > 0) {
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONObject jSONObject = (JSONObject) jSONArray.get(i11);
                        String string = jSONObject.getString("uid");
                        String string2 = jSONObject.getString("avt");
                        String string3 = jSONObject.getString("dispname");
                        if (AbstractC21935u.m114558y(string)) {
                            arrayList.add(new LikeContactItem(string, AbstractC21935u.m114542i(string, string3), string2));
                        }
                    }
                }
                this.f47637a.f12042V.m45136H(arrayList);
                this.f47638b.mo47578p2();
                this.f47638b.mo47582t2(this.f47637a);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.utils.FeedActionZUtils$b */
    /* loaded from: classes4.dex */
    public class C8904b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8913k f47639a;

        /* renamed from: b */
        final /* synthetic */ String f47640b;

        /* renamed from: c */
        final /* synthetic */ PrivacyInfo f47641c;

        C8904b(InterfaceC8913k interfaceC8913k, String str, PrivacyInfo privacyInfo) {
            this.f47639a = interfaceC8913k;
            this.f47640b = str;
            this.f47641c = privacyInfo;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                InterfaceC8913k interfaceC8913k = this.f47639a;
                if (interfaceC8913k != null) {
                    interfaceC8913k.mo47583z1(c20096c);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                InterfaceC8913k interfaceC8913k = this.f47639a;
                if (interfaceC8913k != null) {
                    interfaceC8913k.mo47577o2(this.f47640b, this.f47641c);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.utils.FeedActionZUtils$c */
    /* loaded from: classes4.dex */
    public class C8905c extends C7145n.g {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8913k f47642a;

        /* renamed from: b */
        final /* synthetic */ C3020p0 f47643b;

        C8905c(InterfaceC8913k interfaceC8913k, C3020p0 c3020p0) {
            this.f47642a = interfaceC8913k;
            this.f47643b = c3020p0;
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: a */
        public void mo36357a(int i11) {
            try {
                this.f47642a.mo47579q2(i11, this.f47643b);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: c */
        public void mo36359c(int i11) {
            AbstractC23647d.m123906p("13431");
            AbstractC23647d.m123893c();
            this.f47642a.mo47581s2(i11, this.f47643b);
        }
    }

    /* renamed from: com.zing.zalo.feed.utils.FeedActionZUtils$d */
    /* loaded from: classes4.dex */
    public class C8906d implements InterfaceC8912j {

        /* renamed from: a */
        final /* synthetic */ List f47644a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC8913k f47645b;

        C8906d(List list, InterfaceC8913k interfaceC8913k) {
            this.f47644a = list;
            this.f47645b = interfaceC8913k;
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8912j
        /* renamed from: a */
        public void mo47574a() {
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8912j
        /* renamed from: b */
        public void mo47575b() {
            int i11;
            try {
                PrivacyInfo.m45127K(this.f47644a);
                String str = AbstractC23304d.f113396i2;
                if (this.f47644a.size() == 0) {
                    i11 = 40;
                } else {
                    i11 = 90;
                }
                FeedActionZUtils.m47553k(str, i11, this.f47645b);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8912j
        /* renamed from: c */
        public void mo47576c(List list) {
            int i11;
            try {
                this.f47644a.removeAll(list);
                PrivacyInfo.m45127K(this.f47644a);
                String str = AbstractC23304d.f113396i2;
                if (this.f47644a.size() == 0) {
                    i11 = 40;
                } else {
                    i11 = 90;
                }
                FeedActionZUtils.m47553k(str, i11, this.f47645b);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.utils.FeedActionZUtils$e */
    /* loaded from: classes4.dex */
    public class C8907e extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f47646a;

        C8907e(String str) {
            this.f47646a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ArrayList arrayList = new ArrayList();
            Iterator it = AbstractC20833z.m108909n("new_feed").iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Integer) it.next()).intValue()));
            }
            Iterator it2 = AbstractC20833z.m108909n("like_comment").iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(((Integer) it2.next()).intValue()));
            }
            Iterator it3 = AbstractC20833z.m108909n("comment").iterator();
            while (it3.hasNext()) {
                arrayList.add(String.valueOf(((Integer) it3.next()).intValue()));
            }
            C7960e.m41971c6().m42271T3(this.f47646a, arrayList);
            C7960e.m41971c6().m42290V3(this.f47646a, arrayList);
            AbstractC20833z.m108894I();
        }
    }

    /* renamed from: com.zing.zalo.feed.utils.FeedActionZUtils$f */
    /* loaded from: classes4.dex */
    public class C8908f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f47647a;

        C8908f(String str) {
            this.f47647a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42271T3(this.f47647a, null);
            C7960e.m41971c6().m42290V3(this.f47647a, null);
            AbstractC20833z.m108894I();
        }
    }

    /* renamed from: com.zing.zalo.feed.utils.FeedActionZUtils$g */
    /* loaded from: classes4.dex */
    public class C8909g extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f47648a;

        /* renamed from: b */
        final /* synthetic */ List f47649b;

        C8909g(String str, List list) {
            this.f47648a = str;
            this.f47649b = list;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42271T3(this.f47648a, this.f47649b);
            C7960e.m41971c6().m42290V3(this.f47648a, this.f47649b);
            AbstractC20833z.m108894I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.utils.FeedActionZUtils$h */
    /* loaded from: classes4.dex */
    public class C8910h extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f47650a;

        C8910h(String str) {
            this.f47650a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            for (C32092r7 c32092r7 : FeedActionZUtils.m47556n(C7960e.m41971c6().m42485o5(), this.f47650a)) {
                C7960e.m41971c6().m42280U3(c32092r7);
                C7960e.m41971c6().m42290V3(c32092r7.m154844d(), null);
                AbstractC20833z.m108894I();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.utils.FeedActionZUtils$i */
    /* loaded from: classes4.dex */
    public class C8911i implements ConflictConfirmDialog.InterfaceC8902c {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8912j f47651a;

        /* renamed from: b */
        final /* synthetic */ List f47652b;

        C8911i(InterfaceC8912j interfaceC8912j, List list) {
            this.f47651a = interfaceC8912j;
            this.f47652b = list;
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.ConflictConfirmDialog.InterfaceC8902c
        /* renamed from: a */
        public void mo47572a() {
            try {
                InterfaceC8912j interfaceC8912j = this.f47651a;
                if (interfaceC8912j != null) {
                    interfaceC8912j.mo47574a();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.ConflictConfirmDialog.InterfaceC8902c
        /* renamed from: b */
        public void mo47573b() {
            try {
                InterfaceC8912j interfaceC8912j = this.f47651a;
                if (interfaceC8912j != null) {
                    interfaceC8912j.mo47576c(this.f47652b);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.utils.FeedActionZUtils$j */
    /* loaded from: classes4.dex */
    public interface InterfaceC8912j {
        /* renamed from: a */
        void mo47574a();

        /* renamed from: b */
        void mo47575b();

        /* renamed from: c */
        void mo47576c(List list);
    }

    /* renamed from: com.zing.zalo.feed.utils.FeedActionZUtils$k */
    /* loaded from: classes4.dex */
    public interface InterfaceC8913k {
        /* renamed from: o2 */
        void mo47577o2(String str, PrivacyInfo privacyInfo);

        /* renamed from: p2 */
        void mo47578p2();

        /* renamed from: q2 */
        void mo47579q2(int i11, C3020p0 c3020p0);

        /* renamed from: r2 */
        void mo47580r2();

        /* renamed from: s2 */
        void mo47581s2(int i11, C3020p0 c3020p0);

        /* renamed from: t2 */
        void mo47582t2(C3020p0 c3020p0);

        /* renamed from: z1 */
        void mo47583z1(C20096c c20096c);
    }

    /* renamed from: A */
    public static void m47513A(List list, LinkedHashMap linkedHashMap, ZaloView zaloView, InterfaceC8912j interfaceC8912j) {
        try {
            List m47545d = m47545d(list, linkedHashMap);
            if (m47545d.isEmpty()) {
                if (interfaceC8912j != null) {
                    interfaceC8912j.mo47575b();
                    return;
                }
                return;
            }
            m47537Y(1, zaloView, new C8911i(interfaceC8912j, m47545d));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B */
    private static void m47514B(BaseZaloView baseZaloView, C28202u5 c28202u5) {
        try {
            if (AbstractC23309i.m121072J2() && baseZaloView != null && baseZaloView.m92672lJ() && c28202u5 != null && c28202u5.m141796a()) {
                new C26663n(baseZaloView, 0).m136828d(String.valueOf(c28202u5.f131403a), true, (byte) 1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: C */
    public static void m47515C(int i11, Intent intent, InterfaceC8913k interfaceC8913k) {
        if (i11 == -1 && intent != null && intent.hasExtra("extra_selected_profiles") && intent.hasExtra("extra_list_id")) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles");
            int intExtra = intent.getIntExtra("extra_list_id", -1);
            if (intExtra != -1) {
                if (parcelableArrayListExtra.size() == 0) {
                    if (intExtra != 1000) {
                        PrivacyInfo.m45128M(intExtra, parcelableArrayListExtra);
                    }
                    intExtra = 50;
                } else if (intExtra == 1000) {
                    intExtra = PrivacyInfo.m45129a(parcelableArrayListExtra);
                } else {
                    PrivacyInfo.m45128M(intExtra, parcelableArrayListExtra);
                }
                m47553k(AbstractC23304d.f113396i2, intExtra, interfaceC8913k);
            }
        }
    }

    /* renamed from: D */
    public static void m47516D(int i11, Intent intent, InterfaceC8913k interfaceC8913k, ZaloView zaloView) {
        ArrayList parcelableArrayListExtra;
        int i12;
        if (i11 == -1 && intent != null) {
            try {
                if (intent.hasExtra("extra_selected_profiles") && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles")) != null) {
                    C3003l3 c3003l3 = AbstractC23304d.f113400j2;
                    if (c3003l3 != null) {
                        m47513A(parcelableArrayListExtra, c3003l3.f11957b, zaloView, new C8906d(parcelableArrayListExtra, interfaceC8913k));
                    } else {
                        PrivacyInfo.m45127K(parcelableArrayListExtra);
                        String str = AbstractC23304d.f113396i2;
                        if (parcelableArrayListExtra.size() == 0) {
                            i12 = 40;
                        } else {
                            i12 = 90;
                        }
                        m47553k(str, i12, interfaceC8913k);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: E */
    public static void m47517E(int i11, Intent intent, InterfaceC8913k interfaceC8913k) {
        if (i11 == -1 && intent != null) {
            try {
                if (intent.hasExtra("extra_selected_profiles")) {
                    m47553k(AbstractC23304d.f113396i2, PrivacyInfo.m45129a(intent.getParcelableArrayListExtra("extra_selected_profiles")), interfaceC8913k);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: F */
    public static void m47518F(boolean z11, C3000l0 c3000l0, int i11, InterfaceC27218a interfaceC27218a, InterfaceC2259a interfaceC2259a) {
        C3025q0.d dVar;
        C17487o0 c17487o0;
        if (c3000l0 != null) {
            try {
                C3020p0 m14324b0 = c3000l0.m14324b0(0);
                if (m14324b0 == null || (dVar = (C3025q0.d) m14324b0.f12023C.f12135z.f12156g.get(i11)) == null) {
                    return;
                }
                String str = m14324b0.f12022B.f12280b;
                TrackingSource trackingSource = new TrackingSource(225);
                C32145v4 c32145v4 = dVar.f12174e;
                if (c32145v4 != null) {
                    trackingSource.m40677a("campaignId", c32145v4.f148248a);
                    trackingSource.m40677a("srcId", Integer.valueOf(dVar.f12174e.f148249b));
                    trackingSource.m40677a("tracking_src", dVar.f12174e.f148250c);
                }
                if (!TextUtils.isEmpty(str) && !str.equals("0")) {
                    boolean m114318P = C21927m.m114302u().m114318P(str);
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
                    if (m114318P && m141809c != null) {
                        new C19170a().m101508a(new C19170a.a(interfaceC27218a, str, 0));
                    } else {
                        C21927m.m114302u().m114330e0(str, trackingSource);
                        if (interfaceC27218a != null) {
                            c17487o0 = interfaceC27218a.mo35579p();
                        } else {
                            c17487o0 = null;
                        }
                        C26365a m135743b = new C26365a.b(str, C32002l4.m154264g(10002)).m135743b();
                        if (c17487o0 != null) {
                            new C19171b().m101508a(new C19171b.a(c17487o0.m93021N0(), m135743b, 0, 1));
                        }
                    }
                    if (z11) {
                        AbstractC23647d.m123907q(m47562t("40101%d%d", c3000l0, i11), "");
                    } else {
                        AbstractC23647d.m123907q(m47562t("40102%d%d", c3000l0, i11), "");
                    }
                    m47521I(m14324b0, dVar, 20);
                    AbstractC23647d.m123893c();
                    return;
                }
                AbstractC20814p0.m108620O(new C29105a(interfaceC27218a.getContext(), m14324b0, dVar.f12177h, dVar.f12178i, dVar, interfaceC2259a, trackingSource));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: G */
    public static void m47519G(MenuListPopupView menuListPopupView, InterfaceC27218a interfaceC27218a) {
        try {
            if (menuListPopupView == null) {
                C17487o0 mo35579p = interfaceC27218a.mo35579p();
                ZaloView m92996E0 = mo35579p.m92996E0("MenuListPopupView");
                if (m92996E0 != null) {
                    mo35579p.mo92702G1(m92996E0, 0);
                    return;
                }
                return;
            }
            menuListPopupView.dismiss();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: H */
    public static void m47520H(C3020p0 c3020p0, int i11) {
        if (c3020p0 != null) {
            try {
                C32145v4 c32145v4 = c3020p0.f12039S;
                if (c32145v4 != null) {
                    String str = "";
                    if (!TextUtils.isEmpty(c32145v4.f148250c)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("distid", c3020p0.f12039S.f148250c);
                        str = jSONObject.toString();
                    }
                    String str2 = str;
                    int m14515l = c3020p0.m14515l();
                    if (m14515l > 0) {
                        C28905e m144373n = C28905e.m144373n();
                        C32145v4 c32145v42 = c3020p0.f12039S;
                        m144373n.m144398t(c32145v42.f148248a, i11, m14515l, c3020p0.f12057p, c32145v42.f148249b, C23793c.m124316k().mo124311f(), str2);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: I */
    public static void m47521I(C3020p0 c3020p0, C3025q0.d dVar, int i11) {
        C32145v4 c32145v4;
        String str;
        try {
            int m14515l = c3020p0.m14515l();
            if (m14515l > 0 && dVar != null && (c32145v4 = dVar.f12174e) != null) {
                if (TextUtils.isEmpty(c32145v4.f148250c)) {
                    str = "";
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("distid", dVar.f12174e.f148250c);
                    str = jSONObject.toString();
                }
                C28905e.m144373n().m144398t(dVar.f12174e.f148248a, i11, m14515l, dVar.f12174e.f148248a + dVar.f12174e.f148249b, dVar.f12174e.f148249b, C23793c.m124316k().mo124311f(), str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J */
    public static void m47522J(boolean z11, C3000l0 c3000l0, int i11, InterfaceC27218a interfaceC27218a, InterfaceC2259a interfaceC2259a) {
        C3020p0 m14324b0;
        C3025q0.d dVar;
        String str;
        if (c3000l0 != null) {
            try {
                if (c3000l0.f11893p != 16 || (m14324b0 = c3000l0.m14324b0(0)) == null || (dVar = (C3025q0.d) m14324b0.f12023C.f12135z.f12156g.get(i11)) == null) {
                    return;
                }
                TrackingSource trackingSource = new TrackingSource(225);
                C32145v4 c32145v4 = dVar.f12174e;
                if (c32145v4 != null) {
                    trackingSource.m40677a("campaignId", c32145v4.f148248a);
                    trackingSource.m40677a("srcId", Integer.valueOf(dVar.f12174e.f148249b));
                    trackingSource.m40677a("tracking_src", dVar.f12174e.f148250c);
                }
                String str2 = "";
                if (z11) {
                    AbstractC23647d.m123907q(m47562t("40101%d%d", c3000l0, i11), "");
                } else {
                    AbstractC23647d.m123907q(m47562t("40102%d%d", c3000l0, i11), "");
                }
                AbstractC23647d.m123893c();
                String str3 = dVar.f12188s;
                String str4 = dVar.f12189t;
                C3047v0 c3047v0 = m14324b0.f12022B;
                if (c3047v0 != null && (str = c3047v0.f12280b) != null) {
                    str2 = str;
                }
                if (TextUtils.equals(str3, "action.follow.oa") && C21927m.m114302u().m114318P(str2)) {
                    str3 = "action.unfollow.oa";
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("uid", str2);
                    str4 = jSONObject.toString();
                }
                AbstractC20814p0.m108620O(new C29105a(interfaceC27218a.getContext(), m14324b0, str3, str4, dVar, interfaceC2259a, trackingSource));
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: K */
    public static void m47523K(InterfaceC27218a interfaceC27218a, ContactProfile contactProfile) {
        if (contactProfile == null) {
            return;
        }
        try {
            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
            m140776b.putString("SOURCE_ACTION", "8902");
            if (interfaceC27218a != null) {
                interfaceC27218a.mo35573l4(ChatView.class, m140776b, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: L */
    public static void m47524L(View view, C3000l0 c3000l0, int i11, C17487o0 c17487o0, Bundle bundle, int i12, int i13, boolean z11, C32002l4 c32002l4) {
        m47526N(view instanceof TextView, c3000l0, i11, c17487o0, bundle, i12, i13, z11, c32002l4);
    }

    /* renamed from: M */
    public static void m47525M(C16719g c16719g, C3000l0 c3000l0, int i11, C17487o0 c17487o0, Bundle bundle, int i12, int i13, boolean z11, C32002l4 c32002l4) {
        m47526N(c16719g instanceof C21697g, c3000l0, i11, c17487o0, bundle, i12, i13, z11, c32002l4);
    }

    /* renamed from: N */
    public static void m47526N(boolean z11, C3000l0 c3000l0, int i11, C17487o0 c17487o0, Bundle bundle, int i12, int i13, boolean z12, C32002l4 c32002l4) {
        C3020p0 m14324b0;
        if (c3000l0 != null && (m14324b0 = c3000l0.m14324b0(i11)) != null && !m14324b0.f12027G) {
            m47544c0(m14324b0, z12);
            if (z12 && c3000l0.f11893p == 2) {
                C26878b.f127183a.m138455g(c3000l0, m14324b0);
            } else {
                C26878b.f127183a.m138453e(c3000l0, m14324b0);
            }
            try {
                String m47560r = m47560r(z11, c3000l0, i11);
                AbstractC23647d.m123907q(m47560r, "");
                Bundle bundle2 = new Bundle();
                bundle2.putString("fid", m14324b0.f12057p);
                bundle2.putString("ownerId", m14324b0.f12022B.f12280b);
                boolean z13 = false;
                bundle2.putBoolean("extra_scroll_last_comment", false);
                bundle2.putString("SOURCE_ACTION", m47560r);
                if (i13 == 12) {
                    z13 = true;
                }
                bundle2.putBoolean("extra_from_timeline", z13);
                if (c32002l4 != null) {
                    m47535W(m14324b0, c32002l4.m154280q());
                    bundle2.putString("extra_entry_point_flow", c32002l4.m154277l());
                }
                if (m14324b0.m14498b0()) {
                    bundle2.putInt("feedCate", 1);
                    bundle2.putInt("ftype", m14324b0.f12058q);
                }
                if (i13 == -10) {
                    bundle2.putBoolean("extra_mutual_mode", true);
                }
                if (bundle != null) {
                    bundle2.putAll(bundle);
                }
                if (c17487o0 != null) {
                    c17487o0.m93066i2(FeedDetailsView.class, bundle2, i12, 1, true);
                }
                AbstractC23647d.m123893c();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: O */
    public static void m47527O(String str, C3020p0 c3020p0, TrackingSource trackingSource, InterfaceC2259a interfaceC2259a) {
        int i11;
        try {
            if (!TextUtils.isEmpty(str) && interfaceC2259a != null) {
                if (!TextUtils.isEmpty(AbstractC20550a.m106804a(str))) {
                    interfaceC2259a.mo11970tq(str);
                    return;
                }
                if (c3020p0.m14480I() && interfaceC2259a.mo11923Jd(c3020p0)) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("href", str);
                if (trackingSource != null) {
                    i11 = trackingSource.m40683t();
                } else {
                    i11 = 10;
                }
                bundle.putInt("EXTRA_SOURCE_LINK", i11);
                String m40689a = new TrackingSource.C7894b().m40694f(i11).m40691c(c3020p0.f12057p).m40693e(c3020p0.f12058q).m40692d(c3020p0.m14465A()).m40689a();
                if (!TextUtils.isEmpty(m40689a)) {
                    bundle.putString("EXTRA_SOURCE_PARAM", m40689a);
                }
                interfaceC2259a.mo11922HG(bundle, 9);
            }
        } catch (ActivityNotFoundException unused) {
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11933RC(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: P */
    public static void m47528P(C3020p0 c3020p0, InterfaceC27218a interfaceC27218a) {
        C3063z0 c3063z0;
        if (c3020p0 != null && (c3063z0 = c3020p0.f12023C.f12111b) != null) {
            AbstractC23647d.m123906p("490101");
            AbstractC23647d.m123893c();
            AbstractC23152n3.m119042f0(interfaceC27218a.getContext(), "", c3063z0.m153170b(), c3063z0.m153169a());
        }
    }

    /* renamed from: Q */
    public static void m47529Q(InterfaceC2259a interfaceC2259a, C3000l0 c3000l0, String str, boolean z11) {
        if (interfaceC2259a == null) {
            return;
        }
        try {
            interfaceC2259a.mo11942Ys(c3000l0, str, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: R */
    public static void m47530R(C3020p0 c3020p0, InterfaceC27218a interfaceC27218a, int i11, C32002l4 c32002l4) {
        try {
            String str = c3020p0.f12057p;
            String str2 = c3020p0.f12022B.f12280b;
            Bundle bundle = new Bundle();
            bundle.putString("fid", str);
            bundle.putString("ownerId", str2);
            if (c32002l4 != null) {
                m47535W(c3020p0, c32002l4.m154280q());
                bundle.putString("extra_entry_point_flow", c32002l4.m154277l());
            }
            if (interfaceC27218a != null) {
                interfaceC27218a.mo35579p().m93066i2(FeedDetailsView.class, bundle, 68, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: S */
    public static void m47531S(boolean z11, C3000l0 c3000l0, int i11, InterfaceC27218a interfaceC27218a, InterfaceC2259a interfaceC2259a) {
        if (c3000l0 != null) {
            try {
                if (c3000l0.f11893p == 16) {
                    m47518F(z11, c3000l0, i11, interfaceC27218a, interfaceC2259a);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: T */
    public static void m47532T(String str, String str2, String str3, InterfaceC27218a interfaceC27218a, String str4) {
        if (interfaceC27218a != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("extra_profile_id", str);
                    bundle.putString("extra_vip_dpn", str2);
                    bundle.putString("extra_vip_avt", str3);
                    bundle.putString("extra_action_list_task_id", str4);
                    interfaceC27218a.mo35579p().m93069k2(ShareProfileView.class, bundle, 1, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: U */
    public static void m47533U(AnimationTarget animationTarget, C23528a c23528a, String str, Bundle bundle, C20275e c20275e, int i11, InterfaceC2259a interfaceC2259a, C3020p0 c3020p0, InterfaceC27218a interfaceC27218a, TrackingSource trackingSource, boolean z11, int i12, C32002l4 c32002l4) {
        if (z11 && trackingSource == null && c32002l4 != null) {
            try {
                m47535W(c3020p0, c32002l4.m154280q());
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (c32002l4 != null) {
            bundle.putString("extra_entry_point_flow", c32002l4.m154277l());
        }
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11963mE(animationTarget, c23528a, str, c20275e, bundle, i11, c3020p0);
        }
    }

    /* renamed from: V */
    public static void m47534V(Context context, String str, int i11, int i12) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("token", str);
            jSONObject.put("send_action", i11);
            jSONObject.put("error_code", i12);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        if (context != null) {
            Intent intent = new Intent();
            intent.setAction("com.zing.zalo.shareFeedResultInfo");
            intent.putExtra("result", jSONObject.toString());
            context.sendBroadcast(intent);
        }
    }

    /* renamed from: W */
    public static void m47535W(C3020p0 c3020p0, C31987k4 c31987k4) {
        if (c31987k4 != null && c3020p0 != null) {
            c31987k4.m154202a("feedid", Long.valueOf(c3020p0.f12057p));
            c31987k4.m154202a("feedtype", Integer.valueOf(c3020p0.f12058q));
        }
    }

    /* renamed from: X */
    public static void m47536X(String str, String str2, String str3, InterfaceC27218a interfaceC27218a, Bundle... bundleArr) {
        if (!TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            bundle.putString("sharingUid", str);
            bundle.putString("sharingAvt", str2);
            bundle.putString("sharingDpn", str3);
            bundle.putBoolean("bol_share_in_app", true);
            bundle.putBoolean("isSharingContact", true);
            if (bundleArr != null && bundleArr.length > 0) {
                for (Bundle bundle2 : bundleArr) {
                    bundle.putAll(bundle2);
                }
            }
            if (interfaceC27218a != null) {
                interfaceC27218a.mo35579p().m93069k2(ShareView.class, bundle, 1, true);
            }
        }
    }

    /* renamed from: Y */
    public static void m47537Y(int i11, ZaloView zaloView, ConflictConfirmDialog.InterfaceC8902c interfaceC8902c) {
        try {
            ConflictConfirmDialog m47569WK = ConflictConfirmDialog.m47569WK(i11, zaloView, interfaceC8902c);
            if (m47569WK != null) {
                if (m47569WK.m92687sJ()) {
                    m47569WK.dismiss();
                }
                m47569WK.mo83093TK(zaloView.m92649TI());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Z */
    public static MenuListPopupView m47538Z(Context context, C3020p0 c3020p0, InterfaceC27218a interfaceC27218a, InterfaceC8913k interfaceC8913k) {
        MenuListPopupView menuListPopupView = null;
        try {
            AbstractC23304d.f113396i2 = c3020p0.f12057p;
            AbstractC23304d.f113400j2 = c3020p0.f12059r;
            menuListPopupView = MenuListPopupView.m87747qL(context, false, c3020p0.f12042V, new C8905c(interfaceC8913k, c3020p0), c3020p0.f12059r.f11956a);
            if (menuListPopupView != null) {
                C17487o0 mo35579p = interfaceC27218a.mo35579p();
                ZaloView m92996E0 = mo35579p.m92996E0(menuListPopupView.m87764wL());
                if (m92996E0 != null) {
                    mo35579p.mo92702G1(m92996E0, 0);
                }
                menuListPopupView.m92602UK(mo35579p, menuListPopupView.m87764wL());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return menuListPopupView;
    }

    /* renamed from: a0 */
    public static void m47540a0(C3020p0 c3020p0, InterfaceC8913k interfaceC8913k) {
        if (interfaceC8913k == null) {
            return;
        }
        if (c3020p0.f12042V.m45153y()) {
            c3020p0.f12042V.m45137N();
            if (C23055e5.m118272g(true)) {
                interfaceC8913k.mo47580r2();
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C8903a(c3020p0, interfaceC8913k));
                c0766k.mo1604b7(c3020p0.f12057p, 0, 100, c3020p0.f12042V.f45973p);
                return;
            }
            return;
        }
        PrivacyInfo privacyInfo = c3020p0.f12042V;
        if (privacyInfo.f45973p == 0) {
            privacyInfo.f45977t = 40;
        } else {
            privacyInfo.f45977t = 50;
        }
        interfaceC8913k.mo47582t2(c3020p0);
    }

    /* renamed from: b */
    public static void m47541b(BaseZaloView baseZaloView, C28209v3 c28209v3) {
        try {
            if (AbstractC23309i.m121072J2() && c28209v3 != null && c28209v3.m142152c()) {
                int m142151b = c28209v3.m142151b();
                C28202u5 m142150a = c28209v3.m142150a();
                if (m142150a != null) {
                    if (m142151b != 0) {
                        if (m142151b != 1) {
                            if (m142151b == 2) {
                                AbstractC23647d.m123897g("4915702" + m142150a.f131403a);
                            }
                        } else {
                            AbstractC23647d.m123897g("4915701" + m142150a.f131403a);
                        }
                    } else {
                        AbstractC23647d.m123897g("4915700" + m142150a.f131403a);
                    }
                }
                m47514B(baseZaloView, m142150a);
                c28209v3.m142153d();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b0 */
    public static void m47542b0(InterfaceC27218a interfaceC27218a, Bundle bundle, int i11) {
        String string = bundle.getString("href");
        bundle.remove("href");
        if (interfaceC27218a != null && !TextUtils.isEmpty(string)) {
            ZaloWebView.m87107jS(interfaceC27218a, string, bundle, i11);
        }
    }

    /* renamed from: c */
    public static void m47543c(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                C20817r m108715a = C20817r.m108715a(str);
                String m108911p = AbstractC20833z.m108911p(str2, m108715a);
                if (C28023b6.m141250h0().m141272B0(str2, m108911p)) {
                    C28023b6.m141250h0().m141349h2(str2, m108911p);
                    AbstractC20833z.m108904i(str2, m108715a);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = AbstractC20833z.m108909n(str2).iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Integer) it.next()).intValue()));
                    }
                    C0824j.m2153b(new C8909g(str, arrayList));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: c0 */
    static void m47544c0(C3020p0 c3020p0, boolean z11) {
        C3051w0 c3051w0;
        if (c3020p0 != null && !z11) {
            try {
                C3020p0 m127478n = C24371m0.m127468p().m127478n(c3020p0.f12057p);
                if (m127478n != null) {
                    C3039t0 c3039t0 = c3020p0.f12025E;
                    C3051w0 c3051w02 = m127478n.f12025E.f12246d;
                    C32546b c32546b = null;
                    if (c3051w02 != null) {
                        c3051w0 = new C3051w0(c3051w02);
                    } else {
                        c3051w0 = null;
                    }
                    c3039t0.f12246d = c3051w0;
                    C3039t0 c3039t02 = c3020p0.f12025E;
                    if (m127478n.f12025E.f12247e != null) {
                        c32546b = new C32546b(m127478n.f12025E.f12247e);
                    }
                    c3039t02.f12247e = c32546b;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public static List m47545d(List list, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                if (!list.isEmpty() && linkedHashMap != null && !linkedHashMap.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                        if (linkedHashMap.containsKey(inviteContactProfile.f42434r)) {
                            arrayList.add(inviteContactProfile);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: d0 */
    public static void m47546d0(InterfaceC27218a interfaceC27218a, C23528a c23528a, ItemAlbumMobile itemAlbumMobile, int i11, boolean z11, C32002l4 c32002l4) {
        boolean z12;
        if (interfaceC27218a != null && itemAlbumMobile != null) {
            try {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                arrayList.add(itemAlbumMobile);
                Bundle bundle = new Bundle();
                bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 4);
                bundle.putInt("EXTRA_INT_SUB_TITLE_MODE", 1);
                bundle.putString("userId", itemAlbumMobile.f42593q);
                bundle.putParcelableArrayList("medialist", arrayList);
                bundle.putBoolean("fromProfileCover", true);
                if ((!TextUtils.equals(itemAlbumMobile.f42593q, CoreUtility.f89233i)) && !z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                bundle.putBoolean("EXTRA_SHOULD_PREVENT_SCREENSHOT", z12);
                if (CoreUtility.f89233i.equals(itemAlbumMobile.f42593q)) {
                    bundle.putParcelable("extra_action_data", ActionDataImageViewer.m45081b());
                }
                if (c32002l4 != null) {
                    bundle.putString("extra_entry_point_flow", c32002l4.m154277l());
                }
                C20275e c20275e = new C20275e();
                c20275e.m105883v(true);
                c20275e.m105885x(false);
                interfaceC27218a.mo35556V(null, itemAlbumMobile.f42607x, bundle, c20275e, i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public static void m47547e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            C0824j.m2153b(new C8908f(str));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public static void m47548f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            C20817r m108715a = C20817r.m108715a(str);
            AbstractC20833z.m108904i("new_feed", m108715a);
            AbstractC20833z.m108904i("like", m108715a);
            AbstractC20833z.m108904i("like_comment", m108715a);
            AbstractC20833z.m108904i("comment", m108715a);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public static void m47549g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            m47548f(str);
            m47547e(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public static void m47550h(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            C20817r m108715a = C20817r.m108715a(str);
            AbstractC20833z.m108904i("new_feed", m108715a);
            AbstractC20833z.m108904i("like_comment", m108715a);
            AbstractC20833z.m108904i("comment", m108715a);
            C0824j.m2153b(new C8907e(str));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    public static void m47551i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            C0824j.m2153b(new C8910h(str));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public static void m47552j(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (C28023b6.m141250h0().m141269A0("miss_multiple_feeds")) {
                HashMap m141345g0 = C28023b6.m141250h0().m141345g0("miss_multiple_feeds");
                ArrayList arrayList = new ArrayList();
                if (m141345g0 != null) {
                    Iterator it = m141345g0.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) ((Map.Entry) it.next()).getKey());
                    }
                }
                for (String str2 : m47557o(arrayList, str)) {
                    C28023b6.m141250h0().m141349h2("miss_multiple_feeds", str2);
                    AbstractC20833z.m108905j(str2);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public static void m47553k(String str, int i11, InterfaceC8913k interfaceC8913k) {
        interfaceC8913k.mo47580r2();
        PrivacyInfo privacyInfo = new PrivacyInfo();
        if (i11 != 40) {
            if (i11 != 50) {
                if (i11 != 90) {
                    AbstractC23647d.m123906p("13430");
                    AbstractC23647d.m123893c();
                    privacyInfo.f45973p = 2;
                    privacyInfo.f45974q = new ArrayList(PrivacyInfo.m45134q(i11).f45974q);
                } else {
                    privacyInfo.f45973p = 3;
                    privacyInfo.f45974q = new ArrayList(PrivacyInfo.m45133i().f45974q);
                }
            } else {
                AbstractC23647d.m123906p("13420");
                AbstractC23647d.m123893c();
                privacyInfo.f45973p = 1;
            }
        } else {
            AbstractC23647d.m123906p("13410");
            AbstractC23647d.m123893c();
            privacyInfo.f45973p = 0;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C8904b(interfaceC8913k, str, privacyInfo));
        c0766k.mo1636f7(str, privacyInfo);
    }

    /* renamed from: l */
    public static void m47554l(C3020p0 c3020p0) {
        if (c3020p0 != null) {
            try {
                if (c3020p0.f12039S != null) {
                    C28905e.m144373n().m144390i(50, c3020p0.m14515l(), c3020p0.f12057p, C23793c.m124316k().mo124311f());
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: m */
    public static void m47555m(C3020p0 c3020p0, C3025q0.d dVar) {
        try {
            int m14515l = c3020p0.m14515l();
            if (dVar != null && dVar.f12174e != null) {
                C28905e.m144373n().m144390i(50, m14515l, dVar.f12174e.f148248a + dVar.f12174e.f148249b, C23793c.m124316k().mo124311f());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: n */
    public static List m47556n(List list, String str) {
        if (list != null && !TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C32092r7 c32092r7 = (C32092r7) it.next();
                if (c32092r7.m154841a().equals(str)) {
                    arrayList.add(c32092r7);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* renamed from: o */
    private static List m47557o(List list, String str) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !TextUtils.isEmpty(str)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("MISS_MULTIPLE_FEEDS_" + str)) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: p */
    public static void m47558p(C3020p0 c3020p0) {
        if (c3020p0 != null) {
            try {
                C32145v4 c32145v4 = c3020p0.f12039S;
                if (c32145v4 != null) {
                    String str = "";
                    if (!TextUtils.isEmpty(c32145v4.f148250c)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("distid", c3020p0.f12039S.f148250c);
                        str = jSONObject.toString();
                    }
                    String str2 = str;
                    int m14515l = c3020p0.m14515l();
                    if (m14515l > 0) {
                        C28905e m144373n = C28905e.m144373n();
                        C32145v4 c32145v42 = c3020p0.f12039S;
                        m144373n.m144392k(c32145v42.f148248a, 50, m14515l, c3020p0.f12057p, c32145v42.f148249b, C23793c.m124316k().mo124311f(), str2);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: q */
    public static void m47559q(C3020p0 c3020p0, C3025q0.d dVar) {
        C32145v4 c32145v4;
        String str;
        try {
            int m14515l = c3020p0.m14515l();
            if (m14515l > 0 && dVar != null && (c32145v4 = dVar.f12174e) != null) {
                if (TextUtils.isEmpty(c32145v4.f148250c)) {
                    str = "";
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("distid", dVar.f12174e.f148250c);
                    str = jSONObject.toString();
                }
                C28905e.m144373n().m144392k(dVar.f12174e.f148248a, 50, m14515l, dVar.f12174e.f148248a + dVar.f12174e.f148249b, dVar.f12174e.f148249b, C23793c.m124316k().mo124311f(), str);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: r */
    private static String m47560r(boolean z11, C3000l0 c3000l0, int i11) {
        if (z11) {
            int i12 = c3000l0.f11893p;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        return "";
                    }
                    return String.format("4600%d%d", 1, Integer.valueOf(i11 + 1));
                }
                return String.format("4600%d%d", 2, Integer.valueOf(i11 + 1));
            }
            return "4600";
        }
        int i13 = c3000l0.f11893p;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 4 && i13 != 5) {
                        return "";
                    }
                    return m47562t("40107%d%d", c3000l0, i11);
                }
                return String.format("4700%d%d", 1, Integer.valueOf(i11 + 1));
            }
            return String.format("4700%d%d", 2, Integer.valueOf(i11 + 1));
        }
        return "4700";
    }

    /* renamed from: s */
    public static String m47561s(boolean z11, C3000l0 c3000l0, int i11) {
        if (z11) {
            int i12 = c3000l0.f11893p;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        return "";
                    }
                    return String.format("4200%d%d", 1, Integer.valueOf(i11 + 1));
                }
                return String.format("4200%d%d", 2, Integer.valueOf(i11 + 1));
            }
            return "4200";
        }
        int i13 = c3000l0.f11893p;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    return "";
                }
                return String.format("4300%d%d", 1, Integer.valueOf(i11 + 1));
            }
            return String.format("4300%d%d", 2, Integer.valueOf(i11 + 1));
        }
        return "4300";
    }

    /* renamed from: t */
    public static String m47562t(String str, C3000l0 c3000l0, int i11) {
        int i12 = c3000l0.f11893p;
        if (i12 != 3 && i12 != 7) {
            if (i12 != 16) {
                return "";
            }
            return String.format(str, 6, Integer.valueOf(i11 + 1));
        }
        return String.format(str, 4, Integer.valueOf(i11 + 1));
    }

    /* renamed from: u */
    public static String m47563u(C3000l0 c3000l0, int i11) {
        int i12 = c3000l0.f11893p;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    return "";
                }
                return String.format("4800%d%d", 1, Integer.valueOf(i11 + 1));
            }
            return String.format("4800%d%d", 2, Integer.valueOf(i11 + 1));
        }
        return "4800";
    }

    /* renamed from: v */
    public static TrackingSource m47564v(String str, int i11) {
        TrackingSource trackingSource = new TrackingSource(10);
        trackingSource.m40677a("feedid", Long.valueOf(str));
        trackingSource.m40677a("feedtype", Integer.valueOf(i11));
        return trackingSource;
    }

    /* renamed from: w */
    public static TrackingSource m47565w(int i11) {
        int i12;
        if (i11 != 2 && i11 != 3) {
            i12 = 10;
        } else {
            i12 = 12;
        }
        return new TrackingSource(i12);
    }

    /* renamed from: x */
    public static String m47566x(C3000l0 c3000l0, int i11) {
        if (c3000l0 != null && i11 >= 0) {
            try {
                C3020p0 m14324b0 = c3000l0.m14324b0(i11);
                if (m14324b0 == null) {
                    return "";
                }
                return m14324b0.f12022B.f12280b;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return "";
    }

    /* renamed from: y */
    public static void m47567y(InterfaceC27218a interfaceC27218a, String str) {
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c == null) {
                m141809c = new ContactProfile(str);
            }
            Bundle m140776b = new C27870vb(str).m140780g(m141809c).m140776b();
            m140776b.putString("SOURCE_ACTION", "7802");
            interfaceC27218a.mo35573l4(ChatView.class, m140776b, 1, true);
            AbstractC23647d.m123897g("1830001");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: z */
    public static void m47568z(InterfaceC27218a interfaceC27218a, String str, TrackingSource trackingSource, C32002l4 c32002l4) {
        if (trackingSource != null) {
            try {
                if (trackingSource.m40683t() == 20) {
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (!AbstractC25495a.m132077b(str) && !str.equals("-1")) {
            new C19171b().m101508a(new C19171b.a(interfaceC27218a, new C26365a.b(str, c32002l4).m135741H(trackingSource).m135743b(), 0, 1));
            return;
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_prevent_viewprofile));
    }
}
