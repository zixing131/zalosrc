package com.zing.zalo.report_v2.reportattachment;

import ac.InterfaceC0733x;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.p077ui.imageviewer.BaseImageViewer;
import fn0.AbstractC19074t;
import mj0.AbstractC23322a;
import p649xl.C29982pa;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class ReportImageViewer extends BaseImageViewer implements InterfaceC0733x {

    /* renamed from: j2 */
    private C29982pa f49458j2;

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View mo37483GJ = super.mo37483GJ(layoutInflater, viewGroup, bundle);
        AbstractC19074t.m100205c(mo37483GJ);
        C29982pa m148368a = C29982pa.m148368a(mo37483GJ);
        AbstractC19074t.m100207e(m148368a, "bind(...)");
        this.f49458j2 = m148368a;
        return mo37483GJ;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: cO */
    public void mo50252cO() {
        super.mo50252cO();
        if (this.f88760a0 != null) {
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            Drawable m139659b = C27280g.m139659b(m92689tK, AbstractC23322a.zds_ic_close_line_24, AbstractC16801x.white);
            if (m139659b != null) {
                this.f88760a0.setBackButtonDrawable(m139659b);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: dN */
    public int mo50253dN() {
        return AbstractC7409c0.report_image_viewer_layout;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ReportImageViewer";
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: hO */
    public String mo50254hO(ItemAlbumMobile itemAlbumMobile) {
        return "";
    }
}
