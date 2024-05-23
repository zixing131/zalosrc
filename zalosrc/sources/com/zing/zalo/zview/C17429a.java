package com.zing.zalo.zview;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.zview.ZaloView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import zl0.AbstractC32227d;

/* renamed from: com.zing.zalo.zview.a */
/* loaded from: classes7.dex */
public class C17429a extends C17487o0 {
    @Override // com.zing.zalo.zview.C17487o0
    /* renamed from: G1 */
    public boolean mo92702G1(ZaloView zaloView, int i11) {
        int i12;
        C17478k c17478k;
        C17478k c17478k2;
        InterfaceC1801w interfaceC1801w;
        if (zaloView == null || zaloView.m92681pJ()) {
            return true;
        }
        m93017M();
        if (!this.f89110d.isEmpty()) {
            i12 = this.f89110d.size() - 1;
            while (i12 >= 0) {
                c17478k = (C17478k) this.f89110d.get(i12);
                if (c17478k.f89078e.equals(zaloView.f88781s)) {
                    break;
                }
                i12--;
            }
        }
        i12 = -1;
        c17478k = null;
        if (c17478k == null && !this.f89111e.isEmpty()) {
            int size = this.f89111e.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C17478k c17478k3 = (C17478k) this.f89111e.get(size);
                if (c17478k3.f89078e.equals(zaloView.f88781s)) {
                    c17478k = c17478k3;
                    break;
                }
                size--;
            }
        }
        if (i12 >= 0 && i12 < this.f89110d.size() - 1 && (c17478k2 = (C17478k) this.f89110d.get(i12 + 1)) != null && ZaloView.InterfaceC17423h.class.isAssignableFrom(c17478k2.f89074a) && (interfaceC1801w = c17478k2.f89075b) != null && ((ZaloView.InterfaceC17423h) interfaceC1801w).mo66383c8()) {
            m93005H1(c17478k, i11);
        }
        if (c17478k != null) {
            m93005H1(c17478k, i11);
            this.f89109c = true;
            return true;
        }
        this.f89109c = false;
        return false;
    }

    @Override // com.zing.zalo.zview.C17487o0
    /* renamed from: Q0 */
    public boolean mo92703Q0() {
        if (this.f89110d.size() <= 1) {
            return false;
        }
        return super.mo92703Q0();
    }

    @Override // com.zing.zalo.zview.C17487o0
    /* renamed from: c2 */
    public ZaloView mo57057c2(int i11, Class cls, Bundle bundle, int i12, String str, int i13, boolean z11) {
        try {
            this.f89108b = null;
            if (bundle != null && bundle.containsKey("SHOW_WITH_FLAGS") && (bundle.getInt("SHOW_WITH_FLAGS") & 67108864) == 67108864) {
                if (this.f89113g == null) {
                    this.f89113g = new ArrayList();
                }
                this.f89113g.addAll(this.f89110d);
                Iterator it = this.f89113g.iterator();
                while (it.hasNext()) {
                    m93010J1((C17478k) it.next());
                }
                this.f89110d.clear();
            }
            ZaloView zaloView = (ZaloView) cls.newInstance();
            if (bundle != null) {
                zaloView.mo60305zK(bundle);
            }
            zaloView.m92669jJ();
            zaloView.f88735B = this.f89116j;
            zaloView.f88739F = i11;
            zaloView.f88785u = i12;
            zaloView.f88768i0 = this.f89108b;
            zaloView.f88756W = i13;
            if (TextUtils.isEmpty(str)) {
                str = "ZaloView";
            }
            zaloView.f88740G = str;
            zaloView.f88786v = true;
            C17478k c17478k = new C17478k(this);
            c17478k.f89074a = zaloView.getClass();
            c17478k.f89075b = zaloView;
            c17478k.f89076c = null;
            String uuid = UUID.randomUUID().toString();
            zaloView.f88781s = uuid;
            c17478k.f89078e = uuid;
            if (z11) {
                this.f89110d.add(c17478k);
                zaloView.f88771l0 = this.f89110d.size() - 1;
                m93071l2(c17478k, i13);
            } else {
                this.f89111e.add(c17478k);
                zaloView.f88771l0 = this.f89111e.size() - 1;
                m93046X1(c17478k, i13);
            }
            return zaloView;
        } catch (IllegalAccessException e11) {
            AbstractC32227d.m155418b("ZaloViewManager", "IllegalAccessException occurred in showZaloView", e11);
            throw new ZaloView.InstantiationException("Exception occurred in showZaloView", e11);
        } catch (InstantiationException e12) {
            AbstractC32227d.m155418b("ZaloViewManager", "InstantiationException occurred in showZaloView", e12);
            throw new ZaloView.InstantiationException("Exception occurred in showZaloView", e12);
        }
    }

    /* renamed from: p2 */
    public void m92704p2(Configuration configuration) {
        ZaloView zaloView;
        if (!this.f89111e.isEmpty()) {
            for (int size = this.f89111e.size() - 1; size >= 0; size--) {
                C17478k c17478k = (C17478k) this.f89111e.get(size);
                if (c17478k != null && (zaloView = c17478k.f89075b) != null) {
                    zaloView.onConfigurationChanged(configuration);
                }
            }
        }
    }
}
