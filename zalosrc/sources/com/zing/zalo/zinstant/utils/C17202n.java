package com.zing.zalo.zinstant.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import wj0.InterfaceC29061b;

/* renamed from: com.zing.zalo.zinstant.utils.n */
/* loaded from: classes7.dex */
public final class C17202n {

    /* renamed from: a */
    public static final C17202n f87761a = new C17202n();

    private C17202n() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final void m91830a(View view, Rect rect, Rect rect2) {
        int m116580c;
        int m116580c2;
        int m116584g;
        int m116584g2;
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(rect, "source");
        AbstractC19074t.m100208f(rect2, "destination");
        int[] iArr = new int[2];
        if (AbstractC17201m.m91822n(view, rect2)) {
            view.getLocationInWindow(iArr);
            int i11 = rect2.left;
            int i12 = iArr[0];
            int i13 = i11 + (-i12);
            rect2.left = i13;
            int i14 = rect2.top;
            int i15 = iArr[1];
            int i16 = i14 + (-i15);
            rect2.top = i16;
            int i17 = rect2.right + (-i12);
            rect2.right = i17;
            int i18 = rect2.bottom + (-i15);
            rect2.bottom = i18;
            int i19 = rect.left;
            if (i19 < i17 && i13 < rect.right && rect.top < i18 && i16 < rect.bottom) {
                m116580c = AbstractC22543l.m116580c(i13, i19);
                rect2.left = m116580c;
                m116580c2 = AbstractC22543l.m116580c(rect2.top, rect.top);
                rect2.top = m116580c2;
                m116584g = AbstractC22543l.m116584g(rect2.right, rect.right);
                rect2.right = m116584g;
                m116584g2 = AbstractC22543l.m116584g(rect2.bottom, rect.bottom);
                rect2.bottom = m116584g2;
                if (rect2.width() > 0 && rect2.height() > 0 && (view instanceof InterfaceC29061b)) {
                    int[] iArr2 = new int[2];
                    m91832c((InterfaceC29061b) view, iArr2);
                    int i21 = rect2.left;
                    int i22 = iArr2[0];
                    rect2.left = i21 + i22;
                    int i23 = rect2.top;
                    int i24 = iArr2[1];
                    rect2.top = i23 + i24;
                    rect2.right += i22;
                    rect2.bottom += i24;
                    return;
                }
                return;
            }
        }
        rect2.setEmpty();
    }

    /* renamed from: b */
    public static final void m91831b(View view, Rect rect) {
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(rect, "destination");
        int[] iArr = new int[2];
        if (AbstractC17201m.m91822n(view, rect)) {
            view.getLocationInWindow(iArr);
            int i11 = rect.left;
            int i12 = iArr[0];
            rect.left = i11 + (-i12);
            int i13 = rect.top;
            int i14 = iArr[1];
            rect.top = i13 + (-i14);
            rect.right += -i12;
            rect.bottom += -i14;
            return;
        }
        rect.setEmpty();
    }

    /* renamed from: c */
    public static final void m91832c(InterfaceC29061b interfaceC29061b, int[] iArr) {
        AbstractC19074t.m100208f(interfaceC29061b, "component");
        AbstractC19074t.m100208f(iArr, ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
        iArr[0] = iArr[0] + interfaceC29061b.getZINSNode().mBound.left;
        iArr[1] = iArr[1] + interfaceC29061b.getZINSNode().mBound.top;
        View view = interfaceC29061b.getView();
        if (view.getParent() instanceof InterfaceC29061b) {
            ViewParent parent = view.getParent();
            AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type com.zing.zalo.zinstant.component.ui.ZINSComponent");
            InterfaceC29061b interfaceC29061b2 = (InterfaceC29061b) parent;
            if (interfaceC29061b2.getZINSNode() != null) {
                m91832c(interfaceC29061b2, iArr);
            }
        }
    }
}
