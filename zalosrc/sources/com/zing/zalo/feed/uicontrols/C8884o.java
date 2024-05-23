package com.zing.zalo.feed.uicontrols;

import com.zing.zalo.control.ItemAlbumMobile;
import java.util.ArrayList;
import java.util.List;
import mm0.AbstractC23350e;

/* renamed from: com.zing.zalo.feed.uicontrols.o */
/* loaded from: classes4.dex */
public class C8884o {

    /* renamed from: a */
    public List f47514a;

    /* renamed from: b */
    int f47515b;

    /* renamed from: c */
    double f47516c;

    /* renamed from: d */
    double f47517d;

    /* renamed from: e */
    int f47518e;

    /* renamed from: f */
    boolean f47519f;

    public C8884o(List list, int i11, boolean z11, int i12) {
        this.f47514a = list == null ? new ArrayList() : list;
        this.f47515b = i12;
        this.f47518e = i11;
        this.f47519f = z11;
        this.f47516c = m47402a();
        this.f47517d = 320.0d;
    }

    /* renamed from: a */
    public double m47402a() {
        int size;
        double d11 = 0.0d;
        try {
            if (this.f47519f) {
                size = Math.min(this.f47514a.size(), 9);
            } else {
                size = this.f47514a.size();
            }
            for (int i11 = 0; i11 < size; i11++) {
                ItemAlbumMobile.C7883c c7883c = ((ItemAlbumMobile) this.f47514a.get(i11)).f42596r0;
                if (c7883c != null) {
                    d11 = Math.max(d11, c7883c.f42617d);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return d11;
    }

    /* renamed from: b */
    public boolean m47403b(int i11) {
        ItemAlbumMobile itemAlbumMobile;
        ItemAlbumMobile.C7883c c7883c;
        try {
            itemAlbumMobile = (ItemAlbumMobile) this.f47514a.get(i11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (itemAlbumMobile != null && (c7883c = itemAlbumMobile.f42596r0) != null) {
            int m40541b = c7883c.m40541b(1.0d);
            int m40540a = itemAlbumMobile.f42596r0.m40540a(1.0d);
            if (m40541b <= this.f47517d / 2.0d) {
                if (m40540a <= this.f47516c / 2.0d) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m47404c() {
        List list = this.f47514a;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }
}
