package nk0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.core.util.InterfaceC1479a;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.node.ZOMText;
import com.zing.zalo.zinstant.zom.properties.ZOMClick;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;
import com.zing.zalo.zinstant.zom.text.ZOMTextSpan;
import java.util.Iterator;
import java.util.LinkedList;
import nk0.C23826g1;
import qk0.InterfaceC25305a;
import tk0.C26730b;
import vj0.AbstractC28274h;
import vj0.C28269c;

/* renamed from: nk0.f1 */
/* loaded from: classes7.dex */
public class C23823f1 extends AbstractC23825g0 {

    /* renamed from: H */
    private a f115094H;

    /* renamed from: I */
    private a f115095I;

    /* renamed from: J */
    private C23826g1.a f115096J;

    /* renamed from: K */
    private final C28269c f115097K;

    /* renamed from: L */
    private final Rect f115098L;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nk0.f1$a */
    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a */
        Layout f115099a;

        /* renamed from: b */
        LinkedList f115100b;

        a(Layout layout, LinkedList linkedList) {
            this.f115099a = layout;
            this.f115100b = linkedList;
        }

        /* renamed from: a */
        void m124445a() {
            this.f115099a = null;
            this.f115100b = null;
        }
    }

    public C23823f1(C23855s0 c23855s0, ZOMText zOMText) {
        super(c23855s0, zOMText);
        this.f115094H = null;
        this.f115097K = new C28269c();
        this.f115098L = new Rect();
        m124432w2();
        this.f115095I = m124426q2();
    }

    /* renamed from: k2 */
    private void m124420k2(InterfaceC1479a interfaceC1479a) {
        LinkedList linkedList = this.f115095I.f115100b;
        if (linkedList != null && linkedList.size() > 0) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                interfaceC1479a.accept((C23826g1) it.next());
            }
        }
    }

    /* renamed from: l2 */
    private C23826g1.a m124421l2(MotionEvent motionEvent) {
        m124503Z0(this.f115106B, motionEvent.getX(), motionEvent.getY());
        Rect m131023r = m131023r();
        float[] fArr = this.f115106B;
        if (!m131023r.contains((int) fArr[0], (int) fArr[1])) {
            return null;
        }
        float[] fArr2 = this.f115106B;
        return m124422m2(((int) fArr2[0]) - m131023r.left, ((int) fArr2[1]) - m131023r.top);
    }

    /* renamed from: m2 */
    private C23826g1.a m124422m2(int i11, int i12) {
        CharSequence charSequence;
        C23826g1.a[] aVarArr;
        Layout layout = this.f115095I.f115099a;
        if (layout != null) {
            charSequence = layout.getText();
        } else {
            charSequence = null;
        }
        if (layout != null && charSequence != null) {
            float f11 = i11;
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(i12), f11);
            try {
                aVarArr = (C23826g1.a[]) ((Spanned) layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, C23826g1.a.class);
            } catch (Exception e11) {
                e11.printStackTrace();
                aVarArr = null;
            }
            if (aVarArr != null) {
                for (C23826g1.a aVar : aVarArr) {
                    if (aVar.m124547a()) {
                        Path path = new Path();
                        Spanned spanned = (Spanned) charSequence;
                        layout.getSelectionPath(spanned.getSpanStart(aVar), spanned.getSpanEnd(aVar), path);
                        try {
                            Region region = (Region) Path.class.getField("rects").get(path);
                            if (region != null && region.contains(i11, i12)) {
                                return aVar;
                            }
                        } catch (Throwable unused) {
                            RectF rectF = new RectF();
                            if (!path.isRect(rectF)) {
                                path.computeBounds(rectF, true);
                            }
                            if (rectF.contains(f11, i12)) {
                                return aVar;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o2 */
    public /* synthetic */ void m124424o2(C23826g1 c23826g1) {
        c23826g1.m124545t(m130996B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p2 */
    public /* synthetic */ void m124425p2(C23826g1 c23826g1) {
        c23826g1.m124546z();
        c23826g1.m124545t(m130996B());
    }

    /* renamed from: q2 */
    private a m124426q2() {
        LinkedList m124431v2 = m124431v2(((ZOMText) m131007J()).mParagraph);
        return new a(m124430u2(m124431v2), m124431v2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r2, reason: merged with bridge method [inline-methods] */
    public void m124423n2(C23826g1.a aVar) {
        String str;
        ZOMText zOMText = (ZOMText) m131007J();
        ZOMTextSpan m124548b = aVar.m124548b();
        zOMText.onClickTextSpan(m124548b);
        InterfaceC25305a m131024s = m131024s();
        C26730b m130997C = m130997C();
        ZOMClick zOMClick = m124548b.mClick;
        if (zOMClick != null && zOMClick.valid() && !m124548b.isDeleted) {
            if (TextUtils.isEmpty(m124548b.f88013id)) {
                str = zOMText.mID;
            } else {
                str = m124548b.f88013id;
            }
            String str2 = zOMClick.mAction;
            String str3 = zOMClick.mData;
            if (m130997C != null && !m130997C.m137485b(str2)) {
                return;
            }
            m131024s.mo92032c(this, str, str2, str3);
        }
    }

    /* renamed from: s2 */
    private void m124428s2() {
        final C23826g1.a aVar = this.f115096J;
        if (aVar != null) {
            m131000E().mo124395c(new Runnable() { // from class: nk0.d1
                @Override // java.lang.Runnable
                public final void run() {
                    C23823f1.this.m124423n2(aVar);
                }
            }, this.f115107C, true);
        }
    }

    /* renamed from: t2 */
    private void m124429t2() {
        ZOMTextSpan m124548b;
        ZOMClick zOMClick;
        String str;
        InterfaceC25305a m131024s = m131024s();
        C26730b m130997C = m130997C();
        C23826g1.a aVar = this.f115096J;
        if (aVar != null && (zOMClick = (m124548b = aVar.m124548b()).mLongClick) != null && zOMClick.valid()) {
            if (TextUtils.isEmpty(m124548b.f88013id)) {
                str = ((ZOMText) m131007J()).mID;
            } else {
                str = m124548b.f88013id;
            }
            String str2 = zOMClick.mAction;
            String str3 = zOMClick.mData;
            if (m130997C != null && !m130997C.m137485b(str2)) {
                return;
            }
            m131024s.mo92033d(this, str, str2, str3);
        }
    }

    /* renamed from: u2 */
    private Layout m124430u2(LinkedList linkedList) {
        if (linkedList == null) {
            return null;
        }
        ZOMText zOMText = (ZOMText) m131007J();
        float width = zOMText.mAfterPaddingNode.getWidth();
        float height = zOMText.mAfterPaddingNode.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return null;
        }
        return AbstractC28274h.m142464d(this.f115097K, C23828h0.m124551b(linkedList), width, 1, height, 1, zOMText.mTextAlignment, zOMText.mTextSpacingAdd, zOMText.mTextSpacingMult, zOMText.mTextLetterSpacing, zOMText.mMaxLines);
    }

    /* renamed from: v2 */
    private LinkedList m124431v2(ZOMTextSpan[] zOMTextSpanArr) {
        if (zOMTextSpanArr == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (ZOMTextSpan zOMTextSpan : zOMTextSpanArr) {
            C23826g1 c23826g1 = new C23826g1(zOMTextSpan);
            c23826g1.m124546z();
            c23826g1.m124545t(m130996B());
            linkedList.add(c23826g1);
        }
        return linkedList;
    }

    /* renamed from: w2 */
    private void m124432w2() {
        ZOMRect zOMRect = ((ZOMText) m131007J()).mAfterPaddingNode;
        this.f115098L.set(zOMRect.left, zOMRect.top, zOMRect.right, zOMRect.bottom);
    }

    /* renamed from: x2 */
    private void m124433x2() {
        m124420k2(new InterfaceC1479a() { // from class: nk0.c1
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                C23823f1.this.m124424o2((C23826g1) obj);
            }
        });
    }

    /* renamed from: y2 */
    private void m124434y2() {
        m124420k2(new InterfaceC1479a() { // from class: nk0.e1
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                C23823f1.this.m124425p2((C23826g1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: j0 */
    public void mo124435j0(Canvas canvas) {
        canvas.save();
        Rect rect = this.f115098L;
        canvas.translate(rect.left, rect.top);
        super.mo124435j0(canvas);
        Layout layout = this.f115095I.f115099a;
        if (layout != null) {
            layout.draw(canvas);
        }
        canvas.restore();
    }

    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: n0 */
    public void mo124436n0() {
        super.mo124436n0();
        m124433x2();
    }

    @Override // nk0.AbstractC23825g0
    /* renamed from: o1 */
    public boolean mo124437o1(MotionEvent motionEvent) {
        if (this.f115096J != null && this.f115118s == 2) {
            m124495B1(1, false);
            if (m124421l2(motionEvent) == this.f115096J) {
                m124428s2();
            }
            return true;
        }
        return super.mo124437o1(motionEvent);
    }

    @Override // nk0.AbstractC23825g0
    /* renamed from: q1 */
    public boolean mo124438q1(MotionEvent motionEvent) {
        if (this.f115096J != null && this.f115118s == 2) {
            m124495B1(3, false);
            if (m124421l2(motionEvent) == this.f115096J) {
                m124429t2();
                return true;
            }
            return true;
        }
        return super.mo124438q1(motionEvent);
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: r0 */
    public void mo124439r0(int i11) {
        super.mo124439r0(i11);
        if ((i11 & 16) != 0 || (i11 & 8) != 0) {
            this.f115094H = m124426q2();
        }
    }

    @Override // nk0.AbstractC23825g0
    /* renamed from: r1 */
    public boolean mo124440r1(MotionEvent motionEvent) {
        C23826g1.a m124421l2 = m124421l2(motionEvent);
        C23826g1.a aVar = this.f115096J;
        if (aVar != null && aVar != m124421l2) {
            aVar.m124550d();
            if (AbstractC23825g0.f115102E) {
                throw new IllegalStateException("Previous Affect Span is not release.");
            }
        }
        this.f115096J = m124421l2;
        if (m124421l2 != null && this.f115118s != 2) {
            m124495B1(2, false);
            return true;
        }
        return super.mo124440r1(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nk0.AbstractC23825g0
    /* renamed from: s1 */
    public void mo124441s1() {
        C23826g1.a aVar = this.f115096J;
        if (aVar != null) {
            aVar.m124549c();
            m131013W();
        } else {
            super.mo124441s1();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nk0.AbstractC23825g0
    /* renamed from: u1 */
    public void mo124442u1() {
        C23826g1.a aVar = this.f115096J;
        if (aVar != null) {
            aVar.m124550d();
            m131013W();
            this.f115096J = null;
            return;
        }
        super.mo124442u1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: v0 */
    public void mo124443v0() {
        super.mo124443v0();
        m124432w2();
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: x0 */
    public void mo124444x0(ZOM zom, int i11) {
        super.mo124444x0(zom, i11);
        int i12 = i11 & 16;
        if (i12 != 0 || (i11 & 8) != 0) {
            a aVar = this.f115094H;
            if (aVar != null) {
                this.f115095I = aVar;
            } else {
                this.f115095I.m124445a();
            }
            this.f115094H = null;
        }
        if ((i11 & 4) != 0 || i12 != 0) {
            m124434y2();
        }
    }
}
