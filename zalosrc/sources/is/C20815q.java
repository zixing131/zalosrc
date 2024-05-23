package is;

import ae.C0766k;
import android.content.Intent;
import android.text.Html;
import android.text.TextUtils;
import bn.C2913t1;
import bo.C3051w0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.TagsListView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import is.C20815q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import me0.AbstractC23093i;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p455qo.C25424n0;
import p716zh.C31965ic;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p726zr.C32546b;
import p726zr.C32547c;

/* renamed from: is.q */
/* loaded from: classes4.dex */
public class C20815q {

    /* renamed from: g */
    public boolean f102305g;

    /* renamed from: h */
    public boolean f102306h;

    /* renamed from: j */
    BaseZaloView f102308j;

    /* renamed from: k */
    e f102309k;

    /* renamed from: a */
    Map f102299a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    Map f102300b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private final int f102301c = 60000;

    /* renamed from: d */
    ArrayList f102302d = new ArrayList();

    /* renamed from: e */
    public Set f102303e = new HashSet();

    /* renamed from: f */
    public Map f102304f = new HashMap();

    /* renamed from: i */
    public boolean f102307i = false;

    /* renamed from: l */
    public int f102310l = 0;

    /* renamed from: m */
    public boolean f102311m = false;

    /* renamed from: is.q$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ f f102312a;

        a(f fVar) {
            this.f102312a = fVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C20815q c20815q = C20815q.this;
            int i11 = c20815q.f102310l;
            if (i11 > 0) {
                c20815q.f102310l = i11 - 1;
            }
            c20815q.f102311m = true;
            this.f102312a.mo46250b(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C20815q.this.f102311m = true;
                ItemAlbumMobile m40493h0 = ItemAlbumMobile.m40493h0(((JSONObject) obj).getJSONObject("data"));
                if (m40493h0 != null) {
                    try {
                        C20815q.this.f102299a.put(m40493h0.f42595r, m40493h0);
                        C20815q.this.f102300b.put(m40493h0.f42595r, Long.valueOf(System.currentTimeMillis()));
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                C20815q.this.m108705o(m40493h0, false, this.f102312a);
            } catch (Exception e12) {
                AbstractC23350e.m122776f("FeedMediaViewBusiness", e12);
            }
        }
    }

    /* renamed from: is.q$b */
    /* loaded from: classes4.dex */
    public class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ d f102314a;

        /* renamed from: b */
        final /* synthetic */ ItemAlbumMobile f102315b;

        b(d dVar, ItemAlbumMobile itemAlbumMobile) {
            this.f102314a = dVar;
            this.f102315b = itemAlbumMobile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C20815q.this.f102308j.mo49315c4();
                if (C20815q.this.f102308j.m92687sJ()) {
                    ToastUtils.showMess(C20815q.this.f102308j.m92652XI(AbstractC8020f0.error_message));
                }
                d dVar = this.f102314a;
                if (dVar != null) {
                    dVar.mo87389a(false);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("FeedMediaViewBusiness", e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C20815q.this.f102308j.mo49315c4();
                if (C20815q.this.f102308j.m92687sJ()) {
                    ToastUtils.showMess(C20815q.this.f102308j.m92652XI(C20815q.m108698l(this.f102315b)));
                }
                d dVar = this.f102314a;
                if (dVar != null) {
                    dVar.mo87389a(true);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("FeedMediaViewBusiness", e11);
            }
        }
    }

    /* renamed from: is.q$c */
    /* loaded from: classes4.dex */
    public class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ d f102317a;

        /* renamed from: b */
        final /* synthetic */ String f102318b;

        /* renamed from: c */
        final /* synthetic */ ItemAlbumMobile f102319c;

        c(d dVar, String str, ItemAlbumMobile itemAlbumMobile) {
            this.f102317a = dVar;
            this.f102318b = str;
            this.f102319c = itemAlbumMobile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C20815q.this.f102308j.mo49315c4();
                if (C20815q.this.f102308j.m92687sJ()) {
                    ToastUtils.showMess(C20815q.this.f102308j.m92652XI(AbstractC8020f0.error_message));
                }
                d dVar = this.f102317a;
                if (dVar != null) {
                    dVar.mo87389a(false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C20815q.this.f102308j.mo49315c4();
                Map map = AbstractC23304d.f113405l;
                if (map.get(this.f102318b) != null) {
                    int m153682b = ((C31965ic) map.get(this.f102318b)).m153682b();
                    if (m153682b > 0) {
                        m153682b--;
                    }
                    ((C31965ic) map.get(this.f102318b)).m153686f(m153682b);
                    if (TextUtils.equals(this.f102318b, CoreUtility.f89233i)) {
                        AbstractC23309i.m121105Jz(m153682b);
                    }
                }
                if (C20815q.this.f102308j.m92687sJ()) {
                    ToastUtils.showMess(C20815q.this.f102308j.m92652XI(C20815q.m108696j(this.f102319c)));
                }
                d dVar = this.f102317a;
                if (dVar != null) {
                    dVar.mo87389a(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: is.q$d */
    /* loaded from: classes4.dex */
    public interface d {
        /* renamed from: a */
        void mo87389a(boolean z11);
    }

    /* renamed from: is.q$e */
    /* loaded from: classes4.dex */
    public interface e {
        /* renamed from: a */
        ArrayList mo79722a();

        /* renamed from: b */
        void mo79723b();
    }

    /* renamed from: is.q$f */
    /* loaded from: classes4.dex */
    public interface f {
        /* renamed from: a */
        void mo46249a(ItemAlbumMobile itemAlbumMobile);

        /* renamed from: b */
        void mo46250b(C20096c c20096c);
    }

    /* renamed from: e */
    public static String m108691e(ItemAlbumMobile itemAlbumMobile, String str) {
        int i11;
        String str2;
        if (itemAlbumMobile != null) {
            i11 = itemAlbumMobile.f42591p;
        } else {
            i11 = 0;
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = AbstractC20833z.m108910o(str);
        } else {
            str2 = "";
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (!TextUtils.isEmpty(str2)) {
                    return AbstractC23136l9.m118746s0(AbstractC8020f0.str_tv_feednoexist_new, str2);
                }
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_feednoexist);
            }
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_videonoexist);
        }
        if (!TextUtils.isEmpty(str2)) {
            return AbstractC23136l9.m118746s0(AbstractC8020f0.str_tv_imgnoexist_new, str2);
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_imgnoexist);
    }

    /* renamed from: f */
    public static int m108692f(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null && itemAlbumMobile.f42591p == 2) {
            return AbstractC8020f0.str_video_blockcomment;
        }
        return AbstractC8020f0.str_photo_blockcomment;
    }

    /* renamed from: g */
    public static CharSequence m108693g(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null && !TextUtils.isEmpty(itemAlbumMobile.f42570U) && itemAlbumMobile.f42569T != -1) {
            return Html.fromHtml(String.format(AbstractC23136l9.m118743r0(m108695i(itemAlbumMobile)), itemAlbumMobile.f42570U));
        }
        return AbstractC23136l9.m118743r0(m108694h(itemAlbumMobile));
    }

    /* renamed from: h */
    public static int m108694h(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null && itemAlbumMobile.f42591p == 2) {
            return AbstractC8020f0.str_menu_video_askdelete;
        }
        return AbstractC8020f0.str_menu_photo_askdelete;
    }

    /* renamed from: i */
    public static int m108695i(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null && itemAlbumMobile.f42591p == 2) {
            return AbstractC8020f0.str_profile_album_ask_delete_video_of_album;
        }
        return AbstractC8020f0.str_profile_album_ask_delete_photo_of_album;
    }

    /* renamed from: j */
    public static int m108696j(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null && itemAlbumMobile.f42591p == 2) {
            return AbstractC8020f0.str_menu_video_delete_done;
        }
        return AbstractC8020f0.str_menu_photo_delete_done;
    }

    /* renamed from: k */
    public static int m108697k(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null && itemAlbumMobile.f42591p == 2) {
            return AbstractC8020f0.str_reportvideo_confirm;
        }
        return AbstractC8020f0.str_reportphoto_confirm;
    }

    /* renamed from: l */
    public static int m108698l(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null && itemAlbumMobile.f42591p == 2) {
            return AbstractC8020f0.str_reportvideo_done;
        }
        return AbstractC8020f0.str_reportphoto_done;
    }

    /* renamed from: m */
    public static String m108699m(ItemAlbumMobile itemAlbumMobile) {
        int i11;
        if (itemAlbumMobile != null) {
            i11 = itemAlbumMobile.f42591p;
        } else {
            i11 = 1;
        }
        if (i11 != 2) {
            return "1";
        }
        return "13";
    }

    /* renamed from: n */
    public static int m108700n(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null && itemAlbumMobile.f42591p == 2) {
            return AbstractC8020f0.str_feed_video_untag_confirm_msg;
        }
        return AbstractC8020f0.str_feed_photo_untag_confirm_msg;
    }

    /* renamed from: s */
    public /* synthetic */ void m108701s(ItemAlbumMobile itemAlbumMobile, d dVar, InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        m108703c(itemAlbumMobile, dVar);
    }

    /* renamed from: c */
    public void m108703c(ItemAlbumMobile itemAlbumMobile, d dVar) {
        try {
            String str = itemAlbumMobile.f42593q;
            String str2 = itemAlbumMobile.f42595r;
            BaseZaloView baseZaloView = this.f102308j;
            baseZaloView.mo78950cq(baseZaloView.m92652XI(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new c(dVar, str, itemAlbumMobile));
            c0766k.mo1722qa(str2, 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m108704d(ItemAlbumMobile itemAlbumMobile, f fVar, C32002l4 c32002l4) {
        long j11;
        if (this.f102300b.get(itemAlbumMobile.f42595r) != null) {
            j11 = ((Long) this.f102300b.get(itemAlbumMobile.f42595r)).longValue();
        } else {
            j11 = 0;
        }
        if (this.f102299a.get(itemAlbumMobile.f42595r) != null && System.currentTimeMillis() - j11 < 60000) {
            m108705o((ItemAlbumMobile) this.f102299a.get(itemAlbumMobile.f42595r), true, fVar);
            return;
        }
        if (this.f102310l < 3 && itemAlbumMobile.f42593q.length() > 0 && itemAlbumMobile.f42595r.length() > 0) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a(fVar));
            this.f102310l++;
            c0766k.mo1507P5(itemAlbumMobile.f42595r, 1, "", false, C32017m4.m154326S().m154379y(c32002l4), 0L);
        }
    }

    /* renamed from: o */
    void m108705o(ItemAlbumMobile itemAlbumMobile, boolean z11, f fVar) {
        ArrayList arrayList;
        int i11;
        C3051w0 c3051w0;
        C32546b c32546b;
        try {
            if (this.f102306h) {
                return;
            }
            e eVar = this.f102309k;
            if (eVar != null) {
                arrayList = eVar.mo79722a();
            } else {
                arrayList = null;
            }
            if (itemAlbumMobile != null && arrayList != null) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ItemAlbumMobile itemAlbumMobile2 = (ItemAlbumMobile) arrayList.get(i12);
                    if (itemAlbumMobile2.f42595r.equals(itemAlbumMobile.f42595r)) {
                        itemAlbumMobile2.f42591p = itemAlbumMobile.f42591p;
                        itemAlbumMobile2.f42556G = itemAlbumMobile.f42556G;
                        itemAlbumMobile2.f42560K = itemAlbumMobile.f42560K;
                        C3051w0 c3051w02 = itemAlbumMobile.f42562M;
                        if (c3051w02 != null) {
                            c3051w0 = new C3051w0(c3051w02);
                        } else {
                            c3051w0 = null;
                        }
                        itemAlbumMobile2.f42562M = c3051w0;
                        if (itemAlbumMobile.f42563N != null) {
                            c32546b = new C32546b(itemAlbumMobile.f42563N);
                        } else {
                            c32546b = null;
                        }
                        itemAlbumMobile2.f42563N = c32546b;
                        itemAlbumMobile2.f42561L = itemAlbumMobile.f42561L;
                        itemAlbumMobile2.f42552E = itemAlbumMobile.f42552E;
                        itemAlbumMobile2.f42558I = itemAlbumMobile.f42558I;
                        itemAlbumMobile2.f42599t = itemAlbumMobile.f42599t;
                        itemAlbumMobile2.f42605w = itemAlbumMobile.f42605w;
                        itemAlbumMobile2.f42564O = itemAlbumMobile.f42564O;
                        itemAlbumMobile2.f42574Y = itemAlbumMobile.f42574Y;
                        itemAlbumMobile2.m40524l0(itemAlbumMobile.m40502K());
                        itemAlbumMobile2.f42594q0 = itemAlbumMobile.f42594q0;
                        itemAlbumMobile2.f42554F = itemAlbumMobile.f42554F;
                        m108714z((ItemAlbumMobile) arrayList.get(i12));
                    }
                }
            }
            if (!z11 && (i11 = this.f102310l) > 0) {
                this.f102310l = i11 - 1;
            }
            if (itemAlbumMobile != null && !this.f102302d.contains(itemAlbumMobile.f42595r)) {
                this.f102302d.add(itemAlbumMobile.f42595r);
            }
            fVar.mo46249a(itemAlbumMobile);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    public void m108706p(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            ArrayList mo79722a = this.f102309k.mo79722a();
            if (!TagsListView.m84992tM(intent)) {
                int i12 = 0;
                if (TagsListView.m84991sM(intent)) {
                    this.f102307i = true;
                    String stringExtra = intent.getStringExtra("extra_photo_id");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        while (i12 < mo79722a.size()) {
                            if (((ItemAlbumMobile) mo79722a.get(i12)).f42595r.equals(stringExtra)) {
                                ((ItemAlbumMobile) mo79722a.get(i12)).m40525m();
                                this.f102309k.mo79723b();
                                return;
                            }
                            i12++;
                        }
                        return;
                    }
                    return;
                }
                ArrayList m84989oM = TagsListView.m84989oM(intent);
                if (m84989oM != null && m84989oM.size() > 0) {
                    this.f102303e.addAll(m84989oM);
                    String stringExtra2 = intent.getStringExtra("extra_photo_id");
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        while (i12 < mo79722a.size()) {
                            if (((ItemAlbumMobile) mo79722a.get(i12)).f42595r.equals(stringExtra2)) {
                                ((ItemAlbumMobile) mo79722a.get(i12)).m40522j0(m84989oM, true);
                                this.f102309k.mo79723b();
                                return;
                            }
                            i12++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public void m108707q(BaseZaloView baseZaloView, e eVar) {
        this.f102308j = baseZaloView;
        this.f102309k = eVar;
    }

    /* renamed from: r */
    public boolean m108708r(String str) {
        return this.f102302d.contains(str);
    }

    /* renamed from: u */
    public void m108709u(String str, C32547c c32547c, boolean z11) {
        ItemAlbumMobile itemAlbumMobile;
        String str2;
        if (this.f102299a.containsKey(str) && (itemAlbumMobile = (ItemAlbumMobile) this.f102299a.get(str)) != null) {
            itemAlbumMobile.f42560K = c32547c.m157611b() + "";
            if (c32547c.m157612c()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            itemAlbumMobile.f42552E = str2;
            itemAlbumMobile.f42563N = c32547c.m157610a();
            if (z11 && this.f102305g) {
                AbstractC20805l.m108554l(this.f102304f, itemAlbumMobile);
            }
        }
    }

    /* renamed from: v */
    public void m108710v(ItemAlbumMobile itemAlbumMobile) {
        try {
            this.f102300b.remove(itemAlbumMobile.f42595r);
            this.f102299a.remove(itemAlbumMobile.f42595r);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w */
    public void m108702t(ItemAlbumMobile itemAlbumMobile, d dVar, int i11, String str) {
        try {
            BaseZaloView baseZaloView = this.f102308j;
            baseZaloView.mo78950cq(baseZaloView.m92652XI(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b(dVar, itemAlbumMobile));
            c0766k.mo1787ya(itemAlbumMobile.f42593q, m108699m(itemAlbumMobile), itemAlbumMobile.f42595r, "", i11, str);
        } catch (Exception e11) {
            e11.printStackTrace();
            BaseZaloView baseZaloView2 = this.f102308j;
            if (baseZaloView2 != null) {
                baseZaloView2.mo49315c4();
            }
        }
    }

    /* renamed from: x */
    public void m108712x(ItemAlbumMobile itemAlbumMobile, d dVar) {
        CharSequence m108693g = m108693g(itemAlbumMobile);
        C8009j.a aVar = new C8009j.a(this.f102308j.m92648SI());
        aVar.m43159h(1).m43162k(m108693g).m43165n(this.f102308j.m92652XI(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete), new InterfaceC17463d.d() { // from class: is.p

            /* renamed from: q */
            public final /* synthetic */ ItemAlbumMobile f102269q;

            /* renamed from: r */
            public final /* synthetic */ C20815q.d f102270r;

            public /* synthetic */ C20813p(ItemAlbumMobile itemAlbumMobile2, C20815q.d dVar2) {
                r2 = itemAlbumMobile2;
                r3 = dVar2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C20815q.this.m108701s(r2, r3, interfaceC17463d, i11);
            }
        });
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(false);
        m43152a.mo13822K();
    }

    /* renamed from: y */
    public KeyEventCallbackC17462c m108713y(ItemAlbumMobile itemAlbumMobile, d dVar) {
        KeyEventCallbackC17462c m118464q = AbstractC23093i.m118464q(this.f102308j.m92648SI(), new C2913t1.b() { // from class: is.o

            /* renamed from: b */
            public final /* synthetic */ ItemAlbumMobile f102264b;

            /* renamed from: c */
            public final /* synthetic */ C20815q.d f102265c;

            public /* synthetic */ C20811o(ItemAlbumMobile itemAlbumMobile2, C20815q.d dVar2) {
                r2 = itemAlbumMobile2;
                r3 = dVar2;
            }

            @Override // bn.C2913t1.b
            /* renamed from: a */
            public final void mo13056a(int i11, String str) {
                C20815q.this.m108702t(r2, r3, i11, str);
            }
        }, this.f102308j.m92652XI(m108697k(itemAlbumMobile2)), this.f102308j.m92652XI(AbstractC8020f0.str_yes), this.f102308j.m92652XI(AbstractC8020f0.str_no));
        m118464q.mo13822K();
        return m118464q;
    }

    /* renamed from: z */
    public void m108714z(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null) {
            if (this.f102305g) {
                AbstractC20805l.m108554l(this.f102304f, itemAlbumMobile);
            }
            new C25424n0().m101508a(itemAlbumMobile);
            if (!itemAlbumMobile.m40506Q()) {
                this.f102307i = true;
            }
        }
    }
}
