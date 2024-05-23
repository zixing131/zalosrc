package is;

import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import android.widget.ListView;
import bo.C3030r0;
import c30.C3246i0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.PreviewStickerDialogView;
import com.zing.zalo.social.controls.C10872k;
import com.zing.zalo.social.controls.C10873l;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me0.AbstractC23059e9;
import nb0.C23672c;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p471r3.C25630b;
import p489rn.C25849b;
import p542ub.InterfaceC27218a;
import p716zh.C31854b6;
import p716zh.C31873ca;
import tn.C26736a;
import tn.C26744e;
import vg.C28209v3;

/* renamed from: is.d */
/* loaded from: classes4.dex */
public abstract class AbstractC20789d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: is.d$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C10873l f102154a;

        /* renamed from: b */
        final /* synthetic */ String f102155b;

        a(C10873l c10873l, String str) {
            this.f102154a = c10873l;
            this.f102155b = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e m41971c6 = C7960e.m41971c6();
            String str = AbstractC23304d.f113368c0.f42434r;
            String m56493u = this.f102154a.m56493u();
            String str2 = this.f102155b;
            int m56435C = this.f102154a.m56435C();
            C10873l c10873l = this.f102154a;
            m41971c6.m42062A7(str, m56493u, str2, m56435C, c10873l.f54898N, "", c10873l.f54889E);
            C26744e.m137551e().m137553a(this.f102154a);
            C26736a.m137532e().m137535a(this.f102154a);
        }
    }

    /* renamed from: b */
    public static boolean m108468b() {
        try {
            if (C26736a.m137532e().m137539f()) {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_error_max_async_comment));
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public static void m108469c(ListView listView, C25849b c25849b) {
        if (listView != null && c25849b != null) {
            try {
                int firstVisiblePosition = listView.getFirstVisiblePosition();
                int lastVisiblePosition = listView.getLastVisiblePosition();
                if (firstVisiblePosition >= 0 && firstVisiblePosition < lastVisiblePosition) {
                    while (firstVisiblePosition <= lastVisiblePosition) {
                        C10873l m133430d = c25849b.m133430d(firstVisiblePosition);
                        if (m133430d != null && m133430d.f54893I == 1) {
                            c25849b.notifyDataSetChanged();
                        }
                        firstVisiblePosition++;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public static void m108470d(List list, List list2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            list2.add(i11, (C10873l) list.get(i11));
        }
    }

    /* renamed from: e */
    public static void m108471e(String str, List list) {
        if (list != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C10873l c10873l = (C10873l) it.next();
                        if (c10873l != null && str.equals(c10873l.m56493u())) {
                            it.remove();
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    public static void m108472f(int i11, C17487o0 c17487o0) {
        try {
            ZaloView m92996E0 = c17487o0.m92996E0("CHAT_DIALOG_VIEW_" + i11);
            if (m92996E0 != null) {
                c17487o0.mo92702G1(m92996E0, m92996E0.f88756W);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public static int m108473g(List list, C10873l c10873l) {
        if (list != null && c10873l != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C10873l c10873l2 = (C10873l) list.get(size);
                if (c10873l2.m56493u() != null && c10873l2.m56493u().equals(c10873l.m56493u())) {
                    return size;
                }
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static C28209v3 m108474h(C10873l c10873l) {
        ArrayList arrayList;
        if (c10873l == null) {
            return null;
        }
        try {
            ArrayList m56433B = c10873l.m56433B();
            Collections.sort(m56433B, new Comparator() { // from class: is.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m108476j;
                    m108476j = AbstractC20789d.m108476j((C31873ca) obj, (C31873ca) obj2);
                    return m108476j;
                }
            });
            Iterator it = m56433B.iterator();
            while (it.hasNext()) {
                C31873ca c31873ca = (C31873ca) it.next();
                if (c31873ca != null && (arrayList = c31873ca.f146378c) != null && !arrayList.isEmpty() && c31873ca.f146376a >= 0 && c31873ca.f146377b <= c10873l.m56431A().length()) {
                    Iterator it2 = c31873ca.f146378c.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof C23672c) {
                            return new C28209v3(true, ((C23672c) next).f114678g0, 1);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return new C28209v3(false, null, -1);
    }

    /* renamed from: i */
    public static boolean m108475i(List list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((C10873l) it.next()).m56446L()) {
                            return true;
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: j */
    public static /* synthetic */ int m108476j(C31873ca c31873ca, C31873ca c31873ca2) {
        return Integer.compare(c31873ca.f146376a, c31873ca2.f146376a);
    }

    /* renamed from: k */
    public static C10873l m108477k(JSONObject jSONObject) {
        C10872k c10872k;
        int i11;
        JSONObject m96091j;
        C10873l c10873l = new C10873l();
        c10873l.m56464e0(AbstractC18069a.m96089h(jSONObject, "fid"));
        c10873l.m56468h0(AbstractC18069a.m96089h(jSONObject, "cid"));
        c10873l.m56474k0(AbstractC18069a.m96089h(jSONObject, "oid"));
        c10873l.m56459b0(AbstractC18069a.m96089h(jSONObject, "avt"));
        c10873l.m56472j0(AbstractC18069a.m96089h(jSONObject, "fun"));
        c10873l.m56463d0(AbstractC18069a.m96089h(jSONObject, "fdn"));
        c10873l.m56486q0(AbstractC18069a.m96089h(jSONObject, "tvb"));
        c10873l.m56488r0(AbstractC18069a.m96089h(jSONObject, "tim"));
        c10873l.m56480n0(AbstractC18069a.m96089h(jSONObject, "sck"));
        c10873l.m56476l0(AbstractC18069a.m96085d(jSONObject, "prt"));
        if (jSONObject.has("status")) {
            c10873l.m56482o0(AbstractC18069a.m96085d(jSONObject, "status"));
        } else {
            c10873l.m56482o0(2);
        }
        String m96089h = AbstractC18069a.m96089h(jSONObject, "uid");
        String m96089h2 = AbstractC18069a.m96089h(jSONObject, "replyId");
        String m96089h3 = AbstractC18069a.m96089h(jSONObject, "tdn");
        c10873l.m56490s0(m96089h);
        c10873l.m56478m0(m96089h2);
        if (!TextUtils.isEmpty(m96089h3)) {
            c10873l.m56484p0(AbstractC21935u.m114542i(m96089h, m96089h3));
        }
        c10873l.m56502y0(jSONObject.optJSONObject("recently_liked"));
        int i12 = 0;
        boolean z11 = true;
        if (jSONObject.optInt("is_like") != 1) {
            z11 = false;
        }
        c10873l.m56500x0(z11);
        if (jSONObject.has("mapEffect")) {
            c10873l.f54907W = new C31854b6(jSONObject.optJSONArray("mapEffect"));
        }
        c10873l.m56470i0(AbstractC18069a.m96089h(jSONObject, "con"));
        if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
            i12 = AbstractC18069a.m96085d(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        }
        c10873l.f54893I = i12;
        if (!jSONObject.isNull("attach")) {
            c10872k = new C10872k(AbstractC18069a.m96091j(jSONObject, "attach"));
        } else {
            c10872k = null;
        }
        c10873l.f54891G = c10872k;
        c10873l.f54888D = AbstractC18069a.m96087f(jSONObject, "localCTime");
        c10873l.f54894J = AbstractC18069a.m96085d(jSONObject, "mode");
        c10873l.m56466g0(AbstractC18069a.m96089h(jSONObject, "picid"));
        if (!jSONObject.isNull("stickerId")) {
            i11 = AbstractC18069a.m96085d(jSONObject, "stickerId");
        } else {
            i11 = -1;
        }
        c10873l.f54900P = i11;
        if (jSONObject.has("photo") && !jSONObject.isNull("photo") && (m96091j = AbstractC18069a.m96091j(jSONObject, "photo")) != null) {
            String m96089h4 = AbstractC18069a.m96089h(m96091j, "photoid");
            String m96089h5 = AbstractC18069a.m96089h(m96091j, "thumb");
            String m96089h6 = AbstractC18069a.m96089h(m96091j, "origin");
            ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
            itemAlbumMobile.f42593q = CoreUtility.f89233i;
            itemAlbumMobile.f42595r = m96089h4;
            itemAlbumMobile.f42607x = m96089h6;
            itemAlbumMobile.f42548C = m96089h5;
            c10873l.f54901Q = itemAlbumMobile;
        }
        return c10873l;
    }

    /* renamed from: l */
    public static void m108478l(C3030r0 c3030r0) {
        if (c3030r0 == null) {
            return;
        }
        if (AbstractC23309i.m120933Fb() == 1) {
            try {
                c3030r0.f12215m = C21927m.m114302u().m114304B().contains(c3030r0.f12209g);
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        c3030r0.f12215m = false;
    }

    /* renamed from: m */
    public static void m108479m(List list) {
        if (list != null && !list.isEmpty()) {
            try {
                if (AbstractC23309i.m120933Fb() == 1) {
                    Set m114304B = C21927m.m114302u().m114304B();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C10873l c10873l = (C10873l) it.next();
                        if (c10873l != null) {
                            c10873l.f54906V = m114304B.contains(c10873l.m56497w());
                        }
                    }
                    return;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C10873l c10873l2 = (C10873l) it2.next();
                    if (c10873l2 != null) {
                        c10873l2.f54906V = false;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: n */
    public static void m108480n(PreviewStickerDialogView previewStickerDialogView, C25630b c25630b) {
        C25630b m16487l;
        KeyEventCallbackC17462c keyEventCallbackC17462c;
        if (previewStickerDialogView != null) {
            try {
                C3246i0.a aVar = previewStickerDialogView.f76068K0;
                if (aVar != null && (m16487l = aVar.m16487l()) != null && m16487l.m132429g() == c25630b.m132429g() && (keyEventCallbackC17462c = previewStickerDialogView.f76067J0) != null && keyEventCallbackC17462c.m92868m()) {
                    previewStickerDialogView.f76068K0.m16488s();
                    previewStickerDialogView.f76068K0.m16491v();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: o */
    public static void m108481o(C10873l c10873l) {
        try {
            C0824j.m2153b(new a(c10873l, c10873l.m56441F0().toString()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    public static PreviewStickerDialogView m108482p(int i11, ZaloView zaloView, C17487o0 c17487o0, Object obj) {
        PreviewStickerDialogView previewStickerDialogView = null;
        try {
            m108472f(i11, c17487o0);
            previewStickerDialogView = PreviewStickerDialogView.m82808WK(i11, zaloView, obj);
            if (previewStickerDialogView != null) {
                if (previewStickerDialogView.m92687sJ()) {
                    previewStickerDialogView.dismiss();
                }
                previewStickerDialogView.m92602UK(c17487o0, "CHAT_DIALOG_VIEW_" + i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return previewStickerDialogView;
    }

    /* renamed from: q */
    public static void m108483q(PreviewStickerDialogView previewStickerDialogView, InterfaceC27218a interfaceC27218a) {
        C3246i0.a aVar;
        try {
            AbstractC23059e9.m118319H(interfaceC27218a, false);
            if (previewStickerDialogView != null && (aVar = previewStickerDialogView.f76068K0) != null) {
                aVar.m16482A();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    public static boolean m108484r(String str, C10873l c10873l, List list) {
        if (list != null && c10873l != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    C26736a.m137533h("update new Comment ---" + c10873l.m56441F0().toString());
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (str.equals(((C10873l) list.get(i11)).m56493u())) {
                            list.set(i11, c10873l);
                            return true;
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }
}
