package com.zing.zalo.zinstant.component.p081ui.slider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.AbstractC1906a0;
import androidx.recyclerview.widget.C1929v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.zinstant.component.p081ui.ZinstantView;
import com.zing.zalo.zinstant.component.p081ui.slider.AbstractC17137a;
import com.zing.zalo.zinstant.component.p081ui.slider.ZinstantSliderView;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.utils.C17189a;
import com.zing.zalo.zinstant.utils.C17202n;
import com.zing.zalo.zinstant.zom.meta.ImpressionMeta;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.node.ZOMSlider;
import com.zing.zalo.zinstant.zom.properties.ZOMBackground;
import com.zing.zalo.zinstant.zom.properties.ZOMBorder;
import com.zing.zalo.zinstant.zom.properties.ZOMIndicator;
import com.zing.zalo.zinstant.zom.properties.ZOMMatrix2D;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import nk0.AbstractC23838k1;
import nk0.C23855s0;
import nk0.C23869z0;
import nk0.InterfaceC23860v;
import pm0.C24860q;
import qk0.InterfaceC25305a;
import qk0.InterfaceC25307c;
import wj0.InterfaceC29061b;
import yj0.AbstractC31000c;
import yj0.AbstractC31001d;
import yj0.C31004g;
import yj0.InterfaceC31002e;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class ZinstantSliderView extends RecyclerView implements InterfaceC29061b, InterfaceC31002e {

    /* renamed from: z1 */
    private static final int f87583z1 = ViewConfiguration.getLongPressTimeout();

    /* renamed from: V0 */
    ZOMSlider f87584V0;

    /* renamed from: W0 */
    C17138b f87585W0;

    /* renamed from: X0 */
    WeakReference f87586X0;

    /* renamed from: Y0 */
    int f87587Y0;

    /* renamed from: Z0 */
    int f87588Z0;

    /* renamed from: a1 */
    int f87589a1;

    /* renamed from: b1 */
    int f87590b1;

    /* renamed from: c1 */
    int f87591c1;

    /* renamed from: d1 */
    Handler f87592d1;

    /* renamed from: e1 */
    LinearLayoutManager f87593e1;

    /* renamed from: f1 */
    boolean f87594f1;

    /* renamed from: g1 */
    private boolean f87595g1;

    /* renamed from: h1 */
    int f87596h1;

    /* renamed from: i1 */
    private HashMap f87597i1;

    /* renamed from: j1 */
    private boolean f87598j1;

    /* renamed from: k1 */
    private int f87599k1;

    /* renamed from: l1 */
    private int f87600l1;

    /* renamed from: m1 */
    private float f87601m1;

    /* renamed from: n1 */
    private float f87602n1;

    /* renamed from: o1 */
    private boolean f87603o1;

    /* renamed from: p1 */
    private final int f87604p1;

    /* renamed from: q1 */
    private List f87605q1;

    /* renamed from: r1 */
    private final C23869z0 f87606r1;

    /* renamed from: s1 */
    private final Rect f87607s1;

    /* renamed from: t1 */
    private int f87608t1;

    /* renamed from: u1 */
    private AbstractC1906a0 f87609u1;

    /* renamed from: v1 */
    private final Runnable f87610v1;

    /* renamed from: w1 */
    private int f87611w1;

    /* renamed from: x1 */
    private ArrayList f87612x1;

    /* renamed from: y1 */
    private ArrayList f87613y1;

    /* renamed from: com.zing.zalo.zinstant.component.ui.slider.ZinstantSliderView$a */
    /* loaded from: classes7.dex */
    class RunnableC17127a implements Runnable {
        RunnableC17127a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC25305a interfaceC25305a;
            InterfaceC23860v interfaceC23860v = (InterfaceC23860v) ZinstantSliderView.this.f87586X0.get();
            if (interfaceC23860v != null) {
                interfaceC25305a = interfaceC23860v.mo92022a();
            } else {
                interfaceC25305a = null;
            }
            if (interfaceC25305a == null) {
                return;
            }
            interfaceC25305a.mo92030a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.component.ui.slider.ZinstantSliderView$b */
    /* loaded from: classes7.dex */
    public class C17128b implements Handler.Callback {
        C17128b() {
        }

        /* renamed from: a */
        private void m91616a(int i11, int i12) {
            m91618c(i11, true, i12);
        }

        /* renamed from: b */
        private void m91617b(int i11, int i12) {
            m91618c(i11, false, i12);
        }

        /* renamed from: c */
        private void m91618c(int i11, boolean z11, int i12) {
            if (i11 >= 0 && !ZinstantSliderView.this.f87593e1.m10158v0()) {
                RecyclerView.AbstractC1898y m150725D = AbstractC31001d.m150725D(ZinstantSliderView.this.getContext(), z11, i12);
                m150725D.m10244p(i11);
                ZinstantSliderView.this.f87593e1.m10090H1(m150725D);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            ZinstantSliderView zinstantSliderView = ZinstantSliderView.this;
            zinstantSliderView.f87596h1 = zinstantSliderView.m91580W2();
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 2) {
                    return false;
                }
                if (ZinstantSliderView.this.f87595g1) {
                    return true;
                }
                int i12 = message.arg1;
                int i13 = message.arg2;
                m91616a(i12, message.getData().getInt("align", 0));
                if (i13 == 1) {
                    ZinstantSliderView.this.m91573P2();
                }
                return true;
            }
            if (ZinstantSliderView.this.m91613n2()) {
                ZinstantSliderView zinstantSliderView2 = ZinstantSliderView.this;
                if (zinstantSliderView2.f87589a1 > 0 && zinstantSliderView2.f87585W0 != null && !zinstantSliderView2.f87594f1) {
                    zinstantSliderView2.f87596h1++;
                    int m91578U2 = zinstantSliderView2.m91578U2(zinstantSliderView2.f87608t1);
                    if (ZinstantSliderView.this.m91596q2() >= ZinstantSliderView.this.f87585W0.mo10003k() - 1) {
                        ZinstantSliderView zinstantSliderView3 = ZinstantSliderView.this;
                        zinstantSliderView3.f87591c1++;
                        if (zinstantSliderView3.m91593l2()) {
                            ZinstantSliderView.this.f87596h1 = 0;
                            m91617b(0, m91578U2);
                        }
                    } else {
                        m91617b(ZinstantSliderView.this.f87596h1, m91578U2);
                    }
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.component.ui.slider.ZinstantSliderView$c */
    /* loaded from: classes7.dex */
    public class C17129c extends AbstractC17137a.c {
        C17129c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.zinstant.component.p081ui.slider.AbstractC17137a.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo91619b(AbstractC17137a.d dVar) {
            ZinstantView zinstantView = dVar.f87629I;
            if (zinstantView != null) {
                zinstantView.invalidate();
            }
        }
    }

    /* renamed from: com.zing.zalo.zinstant.component.ui.slider.ZinstantSliderView$d */
    /* loaded from: classes7.dex */
    class C17130d extends AbstractC17137a.c {
        C17130d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.zinstant.component.p081ui.slider.AbstractC17137a.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo91619b(AbstractC17137a.d dVar) {
            ZinstantView zinstantView = dVar.f87629I;
            if (zinstantView != null) {
                zinstantView.onStart();
            }
        }
    }

    /* renamed from: com.zing.zalo.zinstant.component.ui.slider.ZinstantSliderView$e */
    /* loaded from: classes7.dex */
    class C17131e extends AbstractC17137a.c {
        C17131e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.zinstant.component.p081ui.slider.AbstractC17137a.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo91619b(AbstractC17137a.d dVar) {
            ZinstantView zinstantView = dVar.f87629I;
            if (zinstantView != null) {
                zinstantView.onResume();
            }
        }
    }

    /* renamed from: com.zing.zalo.zinstant.component.ui.slider.ZinstantSliderView$f */
    /* loaded from: classes7.dex */
    class C17132f extends AbstractC17137a.c {
        C17132f() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.zinstant.component.p081ui.slider.AbstractC17137a.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo91619b(AbstractC17137a.d dVar) {
            ZinstantView zinstantView = dVar.f87629I;
            if (zinstantView != null) {
                zinstantView.onPause();
            }
        }
    }

    /* renamed from: com.zing.zalo.zinstant.component.ui.slider.ZinstantSliderView$g */
    /* loaded from: classes7.dex */
    class C17133g extends AbstractC17137a.c {
        C17133g() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.zinstant.component.p081ui.slider.AbstractC17137a.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo91619b(AbstractC17137a.d dVar) {
            ZinstantView zinstantView = dVar.f87629I;
            if (zinstantView != null) {
                zinstantView.onStop();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.component.ui.slider.ZinstantSliderView$h */
    /* loaded from: classes7.dex */
    public class C17134h extends AbstractC17137a.c {
        C17134h() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.zinstant.component.p081ui.slider.AbstractC17137a.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo91619b(AbstractC17137a.d dVar) {
            ZinstantView zinstantView = dVar.f87629I;
            if (zinstantView != null) {
                zinstantView.mo91515n();
            }
        }
    }

    /* renamed from: com.zing.zalo.zinstant.component.ui.slider.ZinstantSliderView$i */
    /* loaded from: classes7.dex */
    class C17135i extends AbstractC17137a.c {
        C17135i() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.zinstant.component.p081ui.slider.AbstractC17137a.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo91619b(AbstractC17137a.d dVar) {
            ZinstantView zinstantView = dVar.f87629I;
            if (zinstantView != null) {
                zinstantView.mo91521y();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zinstant.component.ui.slider.ZinstantSliderView$j */
    /* loaded from: classes7.dex */
    public static final class C17136j extends AbstractC31000c {

        /* renamed from: s */
        WeakReference f87623s;

        public C17136j(ZOMIndicator zOMIndicator) {
            super(zOMIndicator);
            this.f87623s = new WeakReference(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A */
        public void m91627A(ZinstantSliderView zinstantSliderView) {
            this.f87623s = new WeakReference(zinstantSliderView);
        }

        @Override // yj0.AbstractC31000c
        /* renamed from: s */
        public C24860q mo91629s(RecyclerView recyclerView) {
            ZinstantSliderView zinstantSliderView = (ZinstantSliderView) this.f87623s.get();
            if (zinstantSliderView != null) {
                return zinstantSliderView.getProgressAndActivePosition();
            }
            return super.mo91629s(recyclerView);
        }
    }

    public ZinstantSliderView(Context context, C23869z0 c23869z0, InterfaceC23860v interfaceC23860v) {
        super(context);
        int i11;
        this.f87591c1 = 0;
        this.f87594f1 = false;
        this.f87595g1 = false;
        this.f87596h1 = 0;
        this.f87597i1 = new HashMap();
        this.f87598j1 = false;
        this.f87599k1 = -1;
        this.f87600l1 = -1;
        this.f87603o1 = false;
        this.f87605q1 = new ArrayList();
        this.f87607s1 = new Rect();
        this.f87608t1 = 0;
        this.f87609u1 = null;
        this.f87610v1 = new RunnableC17127a();
        this.f87611w1 = 0;
        this.f87586X0 = new WeakReference(interfaceC23860v);
        setFocusable(false);
        ZOMSlider zOMSlider = (ZOMSlider) c23869z0.m131007J();
        int i12 = zOMSlider.mMode;
        this.f87587Y0 = i12;
        if (i12 == 0) {
            i11 = zOMSlider.mDuration;
        } else {
            i11 = 0;
        }
        this.f87589a1 = i11;
        this.f87588Z0 = zOMSlider.mAnimation;
        this.f87590b1 = zOMSlider.mLoopCount;
        this.f87604p1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f87593e1 = new LinearLayoutManager(getContext(), 0, false);
        m91603x2();
        m91570M2(zOMSlider.mSnapPosition);
        this.f87606r1 = c23869z0;
        c23869z0.m124699v1(this);
        setZINSNode(zOMSlider);
        m91592k2();
    }

    /* renamed from: A2 */
    private boolean m91563A2() {
        return this.f87611w1 == 2;
    }

    /* renamed from: B2 */
    private boolean m91564B2() {
        return this.f87611w1 == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F2 */
    public /* synthetic */ void m91565F2(int i11, String str) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    m91572O2();
                    return;
                }
                return;
            }
            m91571N2();
            return;
        }
        m91607E2(str);
    }

    /* renamed from: H2 */
    private void m91566H2(int i11) {
        if (((ZOMSlider) this.f87606r1.m131007J()).isShowImmediately()) {
            this.f87593e1.mo9756v1(i11);
        } else {
            m91568K2(i11, m91578U2(this.f87608t1));
        }
    }

    /* renamed from: I2 */
    private void m91567I2() {
        Integer num;
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        if (childCount < 1) {
            return;
        }
        if (childCount == 1) {
            View childAt = getChildAt(0);
            if (childAt instanceof ZinstantView) {
                Integer num2 = (Integer) this.f87597i1.get(((ZinstantView) childAt).getZINSNode());
                int i14 = this.f87599k1;
                int i15 = this.f87600l1;
                if (num2 != null) {
                    i13 = num2.intValue();
                } else {
                    i13 = -1;
                }
                if (i13 != -1) {
                    if (i13 != i14) {
                        this.f87606r1.m124701z1(i14);
                    }
                    if (i13 != i15) {
                        this.f87606r1.m124701z1(i15);
                    }
                    if (i13 != i14 && i13 != i15) {
                        this.f87606r1.m124700x1(i13);
                    }
                }
                this.f87599k1 = i13;
                this.f87600l1 = i13;
                return;
            }
            return;
        }
        View firstVisibleChild = getFirstVisibleChild();
        View lastVisibleChild = getLastVisibleChild();
        Integer num3 = null;
        if (firstVisibleChild != null) {
            num = (Integer) this.f87597i1.get(((ZinstantView) firstVisibleChild).getZINSNode());
        } else {
            num = null;
        }
        if (lastVisibleChild != null) {
            num3 = (Integer) this.f87597i1.get(((ZinstantView) lastVisibleChild).getZINSNode());
        }
        int i16 = this.f87599k1;
        int i17 = this.f87600l1;
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = -1;
        }
        if (num3 != null) {
            i12 = num3.intValue();
        } else {
            i12 = -1;
        }
        this.f87599k1 = i11;
        this.f87600l1 = i12;
        if (i11 < i16 && i11 != -1) {
            this.f87606r1.m124700x1(i11);
        }
        if (i11 > i16 && i16 != -1) {
            this.f87606r1.m124701z1(i16);
        }
        if (i12 > i17 && i12 != -1) {
            this.f87606r1.m124700x1(i12);
        }
        if (i12 < i17 && i17 != -1) {
            this.f87606r1.m124701z1(i17);
        }
    }

    /* renamed from: K2 */
    private void m91568K2(int i11, int i12) {
        this.f87592d1.removeMessages(2);
        Message obtainMessage = this.f87592d1.obtainMessage(2);
        obtainMessage.arg1 = i11;
        obtainMessage.arg2 = -1;
        Bundle bundle = new Bundle();
        bundle.putInt("align", i12);
        obtainMessage.setData(bundle);
        if (this.f87592d1.hasMessages(1)) {
            this.f87592d1.removeMessages(1);
            obtainMessage.arg2 = 1;
        }
        this.f87592d1.sendMessageDelayed(obtainMessage, 16L);
    }

    /* renamed from: L2 */
    private void m91569L2() {
        this.f87591c1 = 1;
    }

    /* renamed from: M2 */
    private void m91570M2(int i11) {
        if (this.f87587Y0 == 0) {
            this.f87608t1 = i11;
            m91594m2();
            C1929v m150727a = C31004g.f143032a.m150727a(i11);
            this.f87609u1 = m150727a;
            m150727a.mo10397b(this);
        }
    }

    /* renamed from: N2 */
    private void m91571N2() {
        Integer num;
        View firstCompleteVisibleChild = getFirstCompleteVisibleChild();
        if ((firstCompleteVisibleChild instanceof ZinstantView) && (num = (Integer) this.f87597i1.get(((ZinstantView) firstCompleteVisibleChild).getZINSNode())) != null && num.intValue() < this.f87605q1.size() - 1) {
            m91566H2(num.intValue() + 1);
        }
    }

    /* renamed from: O2 */
    private void m91572O2() {
        Integer num;
        View firstCompleteVisibleChild = getFirstCompleteVisibleChild();
        if ((firstCompleteVisibleChild instanceof ZinstantView) && (num = (Integer) this.f87597i1.get(((ZinstantView) firstCompleteVisibleChild).getZINSNode())) != null && num.intValue() > 0) {
            m91566H2(num.intValue() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P2 */
    public void m91573P2() {
        if (m91605C2()) {
            this.f87592d1.removeMessages(1);
            int i11 = this.f87589a1;
            if (i11 > 0) {
                this.f87592d1.sendEmptyMessageDelayed(1, i11);
            }
        }
    }

    /* renamed from: Q2 */
    private void m91574Q2() {
        ZOMSlider zOMSlider = this.f87584V0;
        C17138b c17138b = new C17138b(zOMSlider.mWidth, zOMSlider.mHeight, (InterfaceC23860v) this.f87586X0.get());
        this.f87585W0 = c17138b;
        c17138b.m91641V(this.f87588Z0);
        setAdapter(this.f87585W0);
    }

    /* renamed from: R2 */
    private void m91575R2() {
        ZOMBackground zOMBackground = this.f87584V0.mBackground;
        if (zOMBackground != null && zOMBackground.mColor != 0) {
            setBackgroundColor(C17189a.f87752a.m91796b(this.f87606r1.m130996B(), zOMBackground.mColor));
        }
    }

    /* renamed from: S2 */
    private void m91576S2() {
        int i11;
        int i12;
        int i13;
        int i14;
        ZOMSlider zOMSlider = this.f87584V0;
        ZOMRect zOMRect = zOMSlider.mPadding;
        ZOMBorder zOMBorder = zOMSlider.mBorder;
        if (zOMBorder != null) {
            i11 = zOMBorder.width;
        } else {
            i11 = 0;
        }
        if (zOMRect != null) {
            int i15 = zOMRect.left + i11;
            i13 = zOMRect.top + i11;
            i14 = zOMRect.right + i11;
            i12 = i11 + zOMRect.bottom;
            i11 = i15;
        } else {
            i12 = i11;
            i13 = i12;
            i14 = i13;
        }
        setPadding(i11, i13, i14, i12);
    }

    /* renamed from: T2 */
    private void m91577T2() {
        ZOM m131007J = this.f87606r1.m131007J();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = m131007J.mWidth;
            layoutParams.height = m131007J.mHeight;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U2 */
    public int m91578U2(int i11) {
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                return 0;
            }
        }
        return i12;
    }

    /* renamed from: V2 */
    private void m91579V2(List list) {
        C17138b c17138b = this.f87585W0;
        if (c17138b != null) {
            this.f87605q1 = list;
            c17138b.m10635O(list);
            m91581X2();
            m91567I2();
            m91612j2();
            m91573P2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W2 */
    public int m91580W2() {
        int i11 = this.f87608t1;
        if (i11 != 1) {
            if (i11 == 2) {
                return m91596q2();
            }
        } else {
            View mo10402h = this.f87609u1.mo10402h(this.f87593e1);
            if (mo10402h != null) {
                return this.f87593e1.m10112b(mo10402h);
            }
        }
        return m91595p2();
    }

    /* renamed from: X2 */
    private void m91581X2() {
        if (this.f87585W0 != null) {
            HashMap hashMap = new HashMap();
            Iterator it = this.f87605q1.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                hashMap.put(((C23855s0) it.next()).m124620A(), Integer.valueOf(i11));
                i11++;
            }
            this.f87597i1 = hashMap;
        }
    }

    /* renamed from: Y2 */
    private void m91582Y2() {
        if (getItemDecorationCount() > 0) {
            RecyclerView.AbstractC1887n m9835J0 = m9835J0(0);
            if (m9835J0 instanceof AbstractC31000c) {
                ((AbstractC31000c) m9835J0).m150720v(this.f87606r1.m131021p());
            }
        }
    }

    private int getActivePosition() {
        int i11 = this.f87608t1;
        if (i11 != 1) {
            if (i11 != 2) {
                return this.f87593e1.m9740Y1();
            }
            return Math.max(this.f87593e1.m9745c2() - 1, 0);
        }
        return m91597r2(getLeftScrolledOffset());
    }

    private View getFirstCompleteVisibleChild() {
        int m9737T1 = this.f87593e1.m9737T1();
        if (m9737T1 == -1) {
            m9737T1 = this.f87593e1.m9740Y1();
        }
        return this.f87593e1.mo9732P(m9737T1);
    }

    private View getFirstVisibleChild() {
        return this.f87593e1.mo9732P(this.f87593e1.m9740Y1());
    }

    private View getLastVisibleChild() {
        return this.f87593e1.mo9732P(this.f87593e1.m9745c2());
    }

    private int getLeftScrolledOffset() {
        if (this.f87613y1 == null) {
            return computeHorizontalScrollOffset();
        }
        if (getChildCount() <= 0) {
            return computeHorizontalScrollOffset();
        }
        int m9740Y1 = this.f87593e1.m9740Y1();
        if (m9740Y1 != -1 && m9740Y1 < this.f87613y1.size()) {
            View mo9732P = this.f87593e1.mo9732P(m9740Y1);
            if (mo9732P == null) {
                return computeHorizontalScrollOffset();
            }
            return ((Integer) this.f87613y1.get(m9740Y1)).intValue() + (-mo9732P.getLeft());
        }
        return computeHorizontalScrollOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C24860q getProgressAndActivePosition() {
        int activePosition = getActivePosition();
        if (activePosition == -1) {
            return null;
        }
        return new C24860q(Integer.valueOf(activePosition), Float.valueOf(m91601v2(activePosition)));
    }

    /* renamed from: k2 */
    private void m91592k2() {
        if (this.f87606r1.m131026t().getTransformDrawing() != null) {
            ZOMMatrix2D transformMatrix = this.f87606r1.m131026t().getTransformDrawing().getTransformMatrix();
            setTranslationX(transformMatrix.matrix[4]);
            setTranslationY(transformMatrix.matrix[5]);
            setScaleX(transformMatrix.matrix[0]);
            setScaleY(transformMatrix.matrix[3]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l2 */
    public boolean m91593l2() {
        int i11 = this.f87590b1;
        return i11 == 0 || this.f87591c1 < i11;
    }

    /* renamed from: m2 */
    private void m91594m2() {
        AbstractC1906a0 abstractC1906a0 = this.f87609u1;
        if (abstractC1906a0 != null) {
            abstractC1906a0.mo10397b(null);
        }
    }

    /* renamed from: p2 */
    private int m91595p2() {
        int m9737T1 = this.f87593e1.m9737T1();
        if (m9737T1 == -1) {
            return this.f87593e1.m9740Y1();
        }
        return m9737T1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q2 */
    public int m91596q2() {
        int m9741Z1 = this.f87593e1.m9741Z1();
        if (m9741Z1 == -1) {
            return this.f87593e1.m9745c2();
        }
        return m9741Z1;
    }

    /* renamed from: r2 */
    private int m91597r2(int i11) {
        if (this.f87612x1 == null) {
            return 0;
        }
        int width = i11 + (this.f87593e1.getWidth() / 2);
        int i12 = 0;
        for (int i13 = 1; i13 < this.f87612x1.size(); i13++) {
            int i14 = i13 - 1;
            if (width >= ((Integer) this.f87612x1.get(i14)).intValue() && width < ((Integer) this.f87612x1.get(i13)).intValue()) {
                i12 = i14;
            }
        }
        if (width >= ((Integer) this.f87612x1.get(i12)).intValue()) {
            return i12;
        }
        return Math.max(i12 - 1, 0);
    }

    /* renamed from: s2 */
    private float m91598s2(LinearLayoutManager linearLayoutManager, int i11) {
        int max;
        ArrayList arrayList = this.f87612x1;
        if (arrayList == null || arrayList.size() == 0 || i11 >= this.f87612x1.size() || i11 < 0) {
            return 0.0f;
        }
        int leftScrolledOffset = getLeftScrolledOffset() + (linearLayoutManager.getWidth() / 2);
        int intValue = ((Integer) this.f87612x1.get(i11)).intValue();
        if (leftScrolledOffset >= intValue) {
            max = Math.min(i11 + 1, this.f87612x1.size() - 1);
        } else {
            max = Math.max(i11 - 1, 0);
        }
        int intValue2 = ((Integer) this.f87612x1.get(max)).intValue() - intValue;
        if (intValue2 == 0) {
            return 0.0f;
        }
        float f11 = intValue2;
        float f12 = ((leftScrolledOffset - intValue) * 1.0f) / f11;
        if (i11 == m91597r2(0)) {
            float max2 = (Math.max(linearLayoutManager.getWidth() / 2.0f, ((Integer) this.f87612x1.get(0)).intValue()) - intValue) / f11;
            f12 = (f12 - max2) / (1.0f - max2);
        }
        if (max == this.f87605q1.size() - 1) {
            ArrayList arrayList2 = this.f87613y1;
            return f12 / ((((((Integer) arrayList2.get(arrayList2.size() - 1)).intValue() - (linearLayoutManager.getWidth() / 2)) - intValue) * 1.0f) / f11);
        }
        return f12;
    }

    /* renamed from: t2 */
    private int m91599t2(int i11) {
        int i12 = 0;
        if (this.f87613y1 == null) {
            return 0;
        }
        while (i12 < this.f87613y1.size() - 1 && ((Integer) this.f87613y1.get(i12)).intValue() < i11) {
            i12++;
        }
        return i12 - 1;
    }

    /* renamed from: u2 */
    private float m91600u2(LinearLayoutManager linearLayoutManager, int i11) {
        if (linearLayoutManager.mo9732P(i11) == null) {
            return 0.0f;
        }
        return (r2.getLeft() * (-1.0f)) / r2.getWidth();
    }

    /* renamed from: v2 */
    private float m91601v2(int i11) {
        LinearLayoutManager linearLayoutManager = this.f87593e1;
        int i12 = this.f87608t1;
        if (i12 != 1) {
            if (i12 != 2) {
                return m91600u2(linearLayoutManager, i11);
            }
            return m91602w2(linearLayoutManager, i11);
        }
        return m91598s2(linearLayoutManager, i11);
    }

    /* renamed from: w2 */
    private float m91602w2(LinearLayoutManager linearLayoutManager, int i11) {
        View mo9732P = linearLayoutManager.mo9732P(i11 + 1);
        if (mo9732P == null) {
            return 0.0f;
        }
        int right = mo9732P.getRight();
        float width = 1.0f - (((right - r6) * 1.0f) / mo9732P.getWidth());
        if (i11 == m91599t2(linearLayoutManager.getWidth()) - 1) {
            float intValue = 1.0f - (((((Integer) this.f87613y1.get(r3 + 1)).intValue() - r6) * 1.0f) / mo9732P.getWidth());
            return (width - intValue) / (1.0f - intValue);
        }
        return width;
    }

    /* renamed from: x2 */
    private void m91603x2() {
        setLayoutManager(this.f87593e1);
        this.f87592d1 = new Handler(Looper.getMainLooper(), new C17128b());
    }

    /* renamed from: z2 */
    private void m91604z2() {
        int size = this.f87605q1.size();
        int i11 = size + 1;
        this.f87612x1 = new ArrayList(i11);
        this.f87613y1 = new ArrayList(i11);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            this.f87612x1.add(Integer.valueOf((((C23855s0) this.f87605q1.get(i13)).m124651z() / 2) + i12));
            this.f87613y1.add(Integer.valueOf(i12));
            i12 += ((C23855s0) this.f87605q1.get(i13)).m124651z();
        }
        this.f87613y1.add(Integer.valueOf(i12));
    }

    /* renamed from: C2 */
    public boolean m91605C2() {
        if (!m91564B2() && !m91563A2()) {
            return false;
        }
        return true;
    }

    /* renamed from: D2 */
    public boolean m91606D2() {
        return AbstractC17201m.m91822n(this, this.f87607s1);
    }

    /* renamed from: E2 */
    public void m91607E2(String str) {
        if (this.f87585W0 != null) {
            int size = this.f87605q1.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (this.f87605q1.get(i11) != null && TextUtils.equals(str, ((C23855s0) this.f87605q1.get(i11)).f115177a.mID)) {
                    m91566H2(i11);
                    return;
                }
            }
        }
    }

    /* renamed from: G2 */
    public void m91608G2() {
        this.f87606r1.m124698s1();
        m91567I2();
    }

    /* renamed from: J2 */
    public void m91609J2() {
        C17138b c17138b = this.f87585W0;
        if (c17138b != null) {
            c17138b.m91630Q(new C17129c());
        }
    }

    @Override // yj0.InterfaceC31002e
    /* renamed from: a */
    public void mo91610a(int i11, int i12) {
        if (i11 < this.f87605q1.size() && i11 >= 0) {
            if (this.f87587Y0 == 1) {
                m91568K2(i11, i12);
            } else {
                m91566H2(i11);
            }
        }
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: c */
    public void mo91542c(InterfaceC25307c.a aVar) {
        C17202n.m91830a(this, new Rect(0, 0, getZINSNode().mBound.getWidth(), getZINSNode().mBound.getHeight()), new Rect());
        aVar.mo92118a(new ZOMRect(r0.left, r0.top, r0.right, r0.bottom));
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: d */
    public void mo91543d() {
        m91592k2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:            if (r1 != 3) goto L60;     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            ViewParent parent = getParent();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        float abs = Math.abs(rawX - this.f87601m1);
                        float abs2 = Math.abs(rawY - this.f87602n1);
                        if (abs == 0.0f) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        } else if (this.f87585W0 != null && !this.f87603o1) {
                            if (this.f87593e1.mo9757x()) {
                                if (parent != null) {
                                    if (rawX < this.f87601m1 && this.f87593e1.m9741Z1() == this.f87585W0.mo10003k() - 1) {
                                        parent.requestDisallowInterceptTouchEvent(false);
                                    } else if (rawX > this.f87601m1 && this.f87593e1.m9737T1() == 0) {
                                        parent.requestDisallowInterceptTouchEvent(false);
                                    } else if (abs / 3.0f <= abs2) {
                                        parent.requestDisallowInterceptTouchEvent(false);
                                    } else {
                                        this.f87603o1 = true;
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            } else if (this.f87593e1.mo9758y() && parent != null) {
                                if (rawY < this.f87602n1 && this.f87593e1.m9741Z1() == this.f87585W0.mo10003k() - 1) {
                                    parent.requestDisallowInterceptTouchEvent(false);
                                } else if (rawY > this.f87602n1 && this.f87593e1.m9737T1() == 0) {
                                    parent.requestDisallowInterceptTouchEvent(false);
                                } else if (abs2 / 3.0f <= abs) {
                                    parent.requestDisallowInterceptTouchEvent(false);
                                } else {
                                    this.f87603o1 = true;
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
                this.f87594f1 = false;
                if (!this.f87595g1) {
                    m91573P2();
                }
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            } else {
                this.f87601m1 = motionEvent.getRawX();
                this.f87602n1 = motionEvent.getRawY();
                this.f87603o1 = false;
                this.f87594f1 = true;
                this.f87592d1.removeMessages(1);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // yj0.InterfaceC31002e
    /* renamed from: e */
    public void mo91611e(ZOMSlider.ItemsIndexVisibleRunnable itemsIndexVisibleRunnable) {
        int[] iArr;
        int m9745c2 = this.f87593e1.m9745c2();
        if (this.f87585W0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int m9740Y1 = this.f87593e1.m9740Y1(); m9740Y1 <= m9745c2; m9740Y1++) {
                View mo9732P = this.f87593e1.mo9732P(m9740Y1);
                if (mo9732P instanceof ZinstantView) {
                    ZOM zINSNode = ((ZinstantView) mo9732P).getZINSNode();
                    Integer num = (Integer) this.f87597i1.get(zINSNode);
                    if (zINSNode != null && num != null) {
                        arrayList.add(num);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                iArr = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
            } else {
                iArr = null;
            }
            itemsIndexVisibleRunnable.run(iArr);
        }
    }

    @Override // rj0.InterfaceC25812a
    /* renamed from: f */
    public boolean mo91512f(String str, final String str2, final int i11) {
        if (!TextUtils.equals(getZINSNode().mID, str)) {
            return false;
        }
        post(new Runnable() { // from class: yj0.f
            @Override // java.lang.Runnable
            public final void run() {
                ZinstantSliderView.this.m91565F2(i11, str2);
            }
        });
        return true;
    }

    @Override // wj0.InterfaceC29061b
    public ZOMRect getGlobalZOMRect() {
        ZOMSlider zOMSlider = this.f87584V0;
        if (zOMSlider != null) {
            return zOMSlider.mBound;
        }
        return null;
    }

    @Override // wj0.InterfaceC29061b
    public View getView() {
        return this;
    }

    @Override // wj0.InterfaceC29061b
    public ZOM getZINSNode() {
        return this.f87584V0;
    }

    /* renamed from: j2 */
    void m91612j2() {
        ZOMIndicator zOMIndicator = this.f87584V0.mIndicator;
        if (this.f87585W0 != null && zOMIndicator != null && (this.f87605q1.size() > 1 || zOMIndicator.mVisibleForOneItem)) {
            if (getItemDecorationCount() != 0) {
                return;
            }
            C17136j c17136j = new C17136j(this.f87584V0.mIndicator);
            c17136j.m91627A(this);
            m9816A(c17136j);
            m91582Y2();
            return;
        }
        if (getItemDecorationCount() != 0) {
            m9909y1(0);
        }
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: l */
    public void mo91544l(int i11) {
        if ((i11 & 16) != 0) {
            m91615y2();
        }
        if ((i11 & 32) != 0) {
            setVisibility(((ZOMSlider) this.f87606r1.m131007J()).mRelativeVisibility);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: l1 */
    public void mo9892l1(int i11) {
        this.f87598j1 = true;
        super.mo9892l1(i11);
        if (i11 != 0) {
            if (i11 == 1) {
                this.f87592d1.removeMessages(1);
                this.f87592d1.removeMessages(2);
                this.f87595g1 = true;
                return;
            }
            return;
        }
        this.f87595g1 = false;
        m91573P2();
        ImpressionMeta mo124399g = this.f87606r1.m131000E().mo124399g();
        if (mo124399g == null || !mo124399g.isOnlyInterval()) {
            mo91515n();
        }
        m91614o2();
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: m */
    public void mo91545m() {
        int i11;
        ZOMSlider zOMSlider = this.f87584V0;
        int i12 = zOMSlider.mMode;
        this.f87587Y0 = i12;
        if (i12 == 0) {
            i11 = zOMSlider.mDuration;
        } else {
            i11 = 0;
        }
        this.f87589a1 = i11;
        this.f87588Z0 = zOMSlider.mAnimation;
        int i13 = this.f87590b1;
        int i14 = zOMSlider.mLoopCount;
        if (i13 != i14) {
            this.f87590b1 = i14;
            m91569L2();
        }
        C17138b c17138b = this.f87585W0;
        if (c17138b != null) {
            c17138b.m91641V(this.f87588Z0);
        }
        m91573P2();
        m91612j2();
        m91570M2(this.f87584V0.mSnapPosition);
        m91575R2();
        invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: m1 */
    public void mo9894m1(int i11, int i12) {
        super.mo9894m1(i11, i12);
        if (this.f87598j1) {
            m91608G2();
        }
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: n */
    public void mo91515n() {
        C17138b c17138b;
        if (m91606D2() && (c17138b = this.f87585W0) != null) {
            c17138b.m91630Q(new C17134h());
        }
    }

    /* renamed from: n2 */
    public boolean m91613n2() {
        ZOMSlider zOMSlider;
        if (!m91605C2() || (zOMSlider = this.f87584V0) == null) {
            return true;
        }
        if (!zOMSlider.isShowImmediately() && m91593l2()) {
            return true;
        }
        return false;
    }

    /* renamed from: o2 */
    public void m91614o2() {
        this.f87606r1.m124695m1();
    }

    @Override // wj0.InterfaceC29061b
    public void onPause() {
        this.f87611w1 = 3;
        Iterator it = this.f87605q1.iterator();
        while (it.hasNext()) {
            ((C23855s0) it.next()).onPause();
        }
        C17138b c17138b = this.f87585W0;
        if (c17138b != null) {
            c17138b.m91630Q(new C17132f());
        }
        this.f87592d1.removeMessages(1);
        this.f87592d1.removeCallbacks(this.f87610v1);
    }

    @Override // wj0.InterfaceC29061b
    public void onResume() {
        this.f87611w1 = 2;
        m91573P2();
        C17138b c17138b = this.f87585W0;
        if (c17138b != null) {
            c17138b.m91630Q(new C17131e());
        }
    }

    @Override // wj0.InterfaceC29061b
    public void onStart() {
        this.f87611w1 = 1;
        this.f87594f1 = false;
        m91573P2();
        C17138b c17138b = this.f87585W0;
        if (c17138b != null) {
            c17138b.m91630Q(new C17130d());
        }
    }

    @Override // wj0.InterfaceC29061b
    public void onStop() {
        this.f87611w1 = 4;
        m91569L2();
        this.f87594f1 = true;
        this.f87592d1.removeCallbacksAndMessages(null);
        Iterator it = this.f87605q1.iterator();
        while (it.hasNext()) {
            ((C23855s0) it.next()).onStop();
        }
        C17138b c17138b = this.f87585W0;
        if (c17138b != null) {
            c17138b.m91630Q(new C17133g());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:            if (r0 != 3) goto L19;     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        float abs = Math.abs(motionEvent.getRawX() - this.f87601m1);
                        float abs2 = Math.abs(motionEvent.getRawY() - this.f87602n1);
                        int i11 = this.f87604p1;
                        if (abs > i11 || abs2 > i11) {
                            this.f87592d1.removeCallbacks(this.f87610v1);
                        }
                    }
                }
                this.f87592d1.removeCallbacks(this.f87610v1);
            } else {
                this.f87592d1.postDelayed(this.f87610v1, f87583z1);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: p */
    public void mo91546p() {
        setVisibility(((ZOMSlider) this.f87606r1.m131007J()).mRelativeVisibility);
        m91604z2();
        m91577T2();
        m91576S2();
        requestLayout();
        invalidate();
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: q */
    public void mo91517q(AbstractC23838k1 abstractC23838k1) {
        throw new IllegalStateException("ZinstantSlider do not support ZINSComponent.");
    }

    public void setZINSNode(ZOMSlider zOMSlider) {
        this.f87584V0 = zOMSlider;
        if (zOMSlider != null) {
            m91574Q2();
            setClipToPadding(false);
            setHasFixedSize(true);
            mo91545m();
            mo91546p();
            m91615y2();
        }
    }

    @Override // rj0.InterfaceC25812a
    /* renamed from: u */
    public boolean mo91519u(String str) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            KeyEvent.Callback childAt = getChildAt(i11);
            if ((childAt instanceof InterfaceC29061b) && ((InterfaceC29061b) childAt).mo91519u(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: w */
    public void mo91520w(C23855s0 c23855s0, AbstractC23838k1 abstractC23838k1) {
        throw new IllegalStateException("ZinstantSlider do not support ZINSComponent.");
    }

    @Override // qj0.InterfaceC25303a
    /* renamed from: x */
    public void mo91548x() {
        m91582Y2();
        invalidate();
    }

    @Override // wj0.InterfaceC29061b
    /* renamed from: y */
    public void mo91521y() {
        C17138b c17138b = this.f87585W0;
        if (c17138b != null) {
            c17138b.m91630Q(new C17135i());
        }
    }

    /* renamed from: y2 */
    void m91615y2() {
        m91579V2(new ArrayList(this.f87606r1.m124696p1()));
        m91604z2();
    }
}
