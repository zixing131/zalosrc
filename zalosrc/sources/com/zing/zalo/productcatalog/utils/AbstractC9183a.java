package com.zing.zalo.productcatalog.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.pojo.ShareLinkInfo;
import com.zing.zalo.productcatalog.model.Product;
import com.zing.zalo.productcatalog.model.ProductPhoto;
import com.zing.zalo.productcatalog.utils.SendProductSource;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import cy.C17584c;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17976k1;
import dj.C18013y0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23222t7;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p148f3.C18711c;
import p227i3.AbstractC20216t;
import p227i3.C20215s;
import p589vx.C28669n;
import p624wx.C29259b;
import p716zh.C31986k3;
import p716zh.C32098s;
import sx.C26405g;
import ui0.C27280g;

/* renamed from: com.zing.zalo.productcatalog.utils.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9183a {

    /* renamed from: a */
    private static final boolean f48787a = false;

    /* renamed from: b */
    private static final HashMap f48788b = new HashMap();

    /* renamed from: a */
    public static final void m48993a(Context context, C29259b c29259b, boolean z11) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c29259b, "catalog");
        ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119768g(context, m48998f(c29259b), new SensitiveData("clipboard_copy_link_product_catalog", "product_catalog", null, 4, null), false);
        if (z11) {
            ToastUtils.showMess(context.getString(AbstractC8020f0.product_catalog_toast_product_link_copied));
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m48994b(Context context, C29259b c29259b, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        m48993a(context, c29259b, z11);
    }

    /* renamed from: c */
    public static final void m48995c(Context context, Product product, boolean z11) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(product, "product");
        ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119768g(context, m49001i(product), new SensitiveData("clipboard_copy_link_product_catalog", "product_catalog", null, 4, null), false);
        if (z11) {
            ToastUtils.showMess(context.getString(AbstractC8020f0.product_catalog_toast_product_link_copied));
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m48996d(Context context, Product product, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        m48995c(context, product, z11);
    }

    /* renamed from: e */
    public static final String m48997e(Product product) {
        AbstractC19074t.m100208f(product, "<this>");
        if (product.m48491o().length() == 0) {
            String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.product_catalog_default_price);
            AbstractC19074t.m100207e(string, "getString(...)");
            return string;
        }
        return product.m48491o();
    }

    /* renamed from: f */
    public static final String m48998f(C29259b c29259b) {
        boolean m127155R;
        AbstractC19074t.m100208f(c29259b, "catalog");
        if (c29259b.m146166u().length() == 0) {
            AbstractC23350e.m122776f("ProductCatalogHelperExt", new Exception("Catalog path is empty, id: " + c29259b.m146158m()));
        }
        String m146129d = C28669n.Companion.m143559a().m143541Q().m146129d();
        m127155R = AbstractC24342w.m127155R(m146129d, '/', false, 2, null);
        if (!m127155R) {
            m146129d = m146129d + "/";
        }
        return m146129d + c29259b.m146166u();
    }

    /* renamed from: g */
    public static final boolean m48999g() {
        return f48787a;
    }

    /* renamed from: h */
    public static final CharSequence m49000h(Context context, String str, int i11) {
        int i12;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "text");
        Drawable m139660c = C27280g.m139660c(context, i11, AbstractC2807a.icon_02);
        if (m139660c != null) {
            int i13 = AbstractC23222t7.f112582r;
            m139660c.setBounds(0, 0, i13, i13);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("[[image]]  " + str);
            if (Build.VERSION.SDK_INT >= 29) {
                i12 = 2;
            } else {
                i12 = 0;
            }
            spannableStringBuilder.setSpan(new ImageSpan(m139660c, i12), 0, 9, 33);
            return spannableStringBuilder;
        }
        return str;
    }

    /* renamed from: i */
    public static final String m49001i(Product product) {
        boolean m127155R;
        AbstractC19074t.m100208f(product, "product");
        if (product.m48492p().length() == 0) {
            AbstractC23350e.m122776f("ProductCatalogHelperExt", new Exception("Product path is empty, id: " + product.m48485i()));
        }
        String m146129d = C28669n.Companion.m143559a().m143541Q().m146129d();
        m127155R = AbstractC24342w.m127155R(m146129d, '/', false, 2, null);
        if (!m127155R) {
            m146129d = m146129d + "/";
        }
        return m146129d + product.m48492p();
    }

    /* renamed from: j */
    public static final C17976k1 m49002j(String str, String str2) {
        C17584c c17584c;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "conversationId");
        if (C31986k3.f147083a.m154105P1(str2) || (c17584c = (C17584c) f48788b.get(str)) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C20215s.f99966b, c17584c.m93636c().m48968a());
        jSONObject.put(AbstractC20216t.f99969a, c17584c.m93634a());
        C32098s.a m93635b = c17584c.m93635b();
        if (m93635b != null) {
            long j11 = m93635b.f147979c;
            long j12 = 0;
            if (j11 > 0) {
                jSONObject.put("p", j11);
            }
            jSONObject.put(C18711c.f94014e, m93635b.f147978b);
            try {
                String str3 = m93635b.f147977a;
                AbstractC19074t.m100207e(str3, "sellerUid");
                j12 = Long.parseLong(str3);
            } catch (Exception unused) {
            }
            jSONObject.put("su", j12);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("pcl", jSONObject);
        SendProductSource m93636c = c17584c.m93636c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getProductMessageLogProperties: entryPoint= ");
        sb2.append(m93636c);
        sb2.append(", trackingData= ");
        sb2.append(jSONObject2);
        sb2.append(", url: ");
        sb2.append(str);
        return new C17976k1(jSONObject2.toString());
    }

    /* renamed from: k */
    public static final List m49003k(Product product) {
        AbstractC19074t.m100208f(product, "<this>");
        ArrayList arrayList = new ArrayList();
        for (ProductPhoto productPhoto : product.m48479c()) {
            ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
            itemAlbumMobile.f42548C = productPhoto.m48502a();
            itemAlbumMobile.f42609y = productPhoto.m48504c();
            itemAlbumMobile.f42607x = productPhoto.m48510i();
            arrayList.add(itemAlbumMobile);
        }
        return arrayList;
    }

    /* renamed from: l */
    public static final boolean m49004l(List list) {
        AbstractC19074t.m100208f(list, "shareLinkInfoList");
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C26405g m48436c = ((ShareLinkInfo) it.next()).m48436c();
            if (m48436c == null || !m49005m(m48436c)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public static final boolean m49005m(C26405g c26405g) {
        AbstractC19074t.m100208f(c26405g, "shareLinkAttachment");
        int i11 = c26405g.f125488k;
        if (i11 != 7 && i11 != 8) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static final void m49006n(String str, C17584c c17584c) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(c17584c, "trackingData");
        f48788b.put(str, c17584c);
        SendProductSource m93636c = c17584c.m93636c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("keepProductMessageTrackingData: source: ");
        sb2.append(m93636c);
        sb2.append(", trackingData= ");
        sb2.append(c17584c);
        sb2.append(", url: ");
        sb2.append(str);
    }

    /* renamed from: o */
    public static final void m49007o(C26405g c26405g, String str) {
        AbstractC19074t.m100208f(c26405g, "shareLinkAttachment");
        AbstractC19074t.m100208f(str, "sourceStartView");
        try {
            if (m49005m(c26405g)) {
                C17584c c17584c = new C17584c(m49011s(str), c26405g.f125488k, c26405g.f125471A);
                String str2 = c26405g.f125481d;
                AbstractC19074t.m100207e(str2, "href");
                m49006n(str2, c17584c);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: p */
    public static final void m49008p(List list, String str) {
        AbstractC19074t.m100208f(list, "shareLinkInfoList");
        AbstractC19074t.m100208f(str, "sourceStartView");
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C26405g m48436c = ((ShareLinkInfo) it.next()).m48436c();
                if (m48436c != null) {
                    m49007o(m48436c, str);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: q */
    public static final void m49009q(List list, String str) {
        C18013y0 c18013y0;
        C32098s c32098s;
        AbstractC19074t.m100208f(list, "chatContents");
        AbstractC19074t.m100208f(str, "sourceStartView");
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C17969i0 m94929K2 = ((C17945a0) it.next()).m94929K2();
                if (m94929K2 instanceof C18013y0) {
                    c18013y0 = (C18013y0) m94929K2;
                } else {
                    c18013y0 = null;
                }
                if (c18013y0 != null && (c32098s = c18013y0.f91251B) != null && c32098s.m154940j()) {
                    SendProductSource m49011s = m49011s(str);
                    C32098s c32098s2 = c18013y0.f91251B;
                    m49006n(c18013y0.f91014s, new C17584c(m49011s, c32098s2.f147956f, c32098s2.f147975y));
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: r */
    public static final void m49010r(C17945a0 c17945a0) {
        C18013y0 c18013y0;
        C32098s c32098s;
        AbstractC19074t.m100208f(c17945a0, "message");
        try {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C18013y0) {
                c18013y0 = (C18013y0) m94929K2;
            } else {
                c18013y0 = null;
            }
            if (c18013y0 != null && (c32098s = c18013y0.f91251B) != null && c32098s.m154940j() && c17945a0.m95040W3() == null) {
                String str = c18013y0.f91014s;
                String mo95039W2 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                c17945a0.m94979Pa(m49002j(str, mo95039W2));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007b, code lost:            return com.zing.zalo.productcatalog.utils.SendProductSource.ChatForwardMsg.f48777q;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:            if (r1.equals("csc_msg_multiselect") != false) goto L41;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:            if (r1.equals("chat_forward") == false) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:            if (r1.equals("csc_msgmenu") == false) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:            if (r1.equals("csc_msg_button") == false) goto L40;     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final SendProductSource m49011s(String str) {
        switch (str.hashCode()) {
            case -2070373868:
                break;
            case -1717242658:
                break;
            case -856047604:
                if (str.equals("product_manage_multi_select")) {
                    return SendProductSource.ProductManageMultiSelect.f48783q;
                }
                break;
            case 285911983:
                if (str.equals("product_manage_share_catalog")) {
                    return SendProductSource.ProductManageShareCatalog.f48784q;
                }
                break;
            case 1077239828:
                if (str.equals("action_common")) {
                    return SendProductSource.ActionCommon.f48775q;
                }
                break;
            case 1312003781:
                if (str.equals("catalog_manage_share_catalog")) {
                    return SendProductSource.CatalogManageShareCatalog.f48776q;
                }
                break;
            case 1561491289:
                if (str.equals("product_manage_context_menu_share")) {
                    return SendProductSource.ProductManageContextMenuShare.f48782q;
                }
                break;
            case 1849022827:
                break;
            case 1897949052:
                break;
            case 2015765989:
                if (str.equals("webview_menu")) {
                    return SendProductSource.WebViewMenu.f48786q;
                }
                break;
        }
        return SendProductSource.Unknown.f48785q;
    }
}
