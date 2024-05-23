package com.zing.zalo.p077ui.imageviewer;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ItemAlbumMobile;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p649xl.C29887k5;

/* loaded from: classes5.dex */
public final class ProductCatalogImageViewer extends BaseImageViewer implements InterfaceC0733x {
    public static final C12056a Companion = new C12056a(null);

    /* renamed from: j2 */
    private C29887k5 f62913j2;

    /* renamed from: com.zing.zalo.ui.imageviewer.ProductCatalogImageViewer$a */
    /* loaded from: classes5.dex */
    public static final class C12056a {
        private C12056a() {
        }

        public /* synthetic */ C12056a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View mo37483GJ = super.mo37483GJ(layoutInflater, viewGroup, bundle);
        AbstractC19074t.m100205c(mo37483GJ);
        C29887k5 m148157a = C29887k5.m148157a(mo37483GJ);
        AbstractC19074t.m100207e(m148157a, "bind(...)");
        this.f62913j2 = m148157a;
        return mo37483GJ;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: dN */
    public int mo50253dN() {
        return AbstractC7409c0.layout_image_viewer_product_catalog;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ProductCatalogImageViewer";
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: hO */
    public String mo50254hO(ItemAlbumMobile itemAlbumMobile) {
        String str;
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("EXTRA_STR_TITLE", "");
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: nN */
    public void mo66727nN(Bundle bundle) {
        super.mo66727nN(bundle);
        mo66736rO(8);
    }
}
