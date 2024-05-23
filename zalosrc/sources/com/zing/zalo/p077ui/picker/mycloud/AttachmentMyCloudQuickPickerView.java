package com.zing.zalo.p077ui.picker.mycloud;

import ac.InterfaceC0733x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Size;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC1801w;
import au.AbstractC2379w;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.mediastore.TabViewLayout;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.picker.mycloud.AttachmentMyCloudQuickPickerView;
import com.zing.zalo.p077ui.picker.mycloud.model.SelectedItemData;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import mw.EnumC23460e;
import p279jw.C21373a;
import p500s1.C26087b;
import p542ub.InterfaceC27218a;
import p649xl.C29816g6;
import p90.C24686f;
import p90.InterfaceC24681a;
import p90.InterfaceC24682b;
import p90.InterfaceC24697q;
import q90.C25201d;
import qm0.AbstractC25370t;

/* loaded from: classes6.dex */
public final class AttachmentMyCloudQuickPickerView extends BottomSheetZaloViewWithAnim implements ZaloView.InterfaceC17421f, InterfaceC0733x, InterfaceC24682b {
    public static final C12859a Companion = new C12859a(null);

    /* renamed from: W0 */
    private C29816g6 f66828W0;

    /* renamed from: X0 */
    private C25201d f66829X0;

    /* renamed from: Y0 */
    private InterfaceC24681a f66830Y0;

    /* renamed from: Z0 */
    private C12869a f66831Z0;

    /* renamed from: a1 */
    private boolean f66832a1;

    /* renamed from: b1 */
    private String f66833b1 = "";

    /* renamed from: c1 */
    private final float f66834c1 = AbstractC23136l9.m118742r(14.0f);

    /* renamed from: d1 */
    private C13306b f66835d1;

    /* renamed from: com.zing.zalo.ui.picker.mycloud.AttachmentMyCloudQuickPickerView$a */
    /* loaded from: classes6.dex */
    public static final class C12859a {
        private C12859a() {
        }

        public /* synthetic */ C12859a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mycloud.AttachmentMyCloudQuickPickerView$b */
    /* loaded from: classes6.dex */
    public static final class C12860b implements TabViewLayout.InterfaceC12338a {
        C12860b() {
        }

        @Override // com.zing.zalo.p077ui.mediastore.TabViewLayout.InterfaceC12338a
        /* renamed from: a */
        public void mo69408a(int i11) {
            C29816g6 c29816g6 = AttachmentMyCloudQuickPickerView.this.f66828W0;
            C29816g6 c29816g62 = null;
            if (c29816g6 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29816g6 = null;
            }
            if (i11 != c29816g6.f137858D.getCurrentItem()) {
                C25201d c25201d = AttachmentMyCloudQuickPickerView.this.f66829X0;
                if (c25201d != null) {
                    c25201d.m130446E(i11);
                }
                C29816g6 c29816g63 = AttachmentMyCloudQuickPickerView.this.f66828W0;
                if (c29816g63 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                } else {
                    c29816g62 = c29816g63;
                }
                c29816g62.f137858D.setCurrentItem(i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mycloud.AttachmentMyCloudQuickPickerView$c */
    /* loaded from: classes6.dex */
    public static final class C12861c implements C25201d.a {
        C12861c() {
        }

        @Override // q90.C25201d.a
        /* renamed from: O1 */
        public boolean mo72544O1(SelectedItemData selectedItemData, boolean z11) {
            InterfaceC24681a interfaceC24681a = AttachmentMyCloudQuickPickerView.this.f66830Y0;
            if (interfaceC24681a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC24681a = null;
            }
            return interfaceC24681a.mo128240O1(selectedItemData, z11);
        }

        @Override // q90.C25201d.a
        /* renamed from: Y0 */
        public boolean mo72545Y0() {
            return AttachmentMyCloudQuickPickerView.this.f66832a1;
        }

        @Override // q90.C25201d.a
        /* renamed from: Z0 */
        public String mo72546Z0() {
            return AttachmentMyCloudQuickPickerView.this.f66833b1;
        }

        @Override // q90.C25201d.a
        /* renamed from: a1 */
        public void mo72547a1(MyCloudMessageItem myCloudMessageItem, C16719g c16719g) {
            AbstractC19074t.m100208f(myCloudMessageItem, "item");
            AttachmentMyCloudQuickPickerView.this.m72522JM(myCloudMessageItem, c16719g);
        }

        @Override // q90.C25201d.a
        /* renamed from: v */
        public List mo72548v() {
            InterfaceC24681a interfaceC24681a = AttachmentMyCloudQuickPickerView.this.f66830Y0;
            if (interfaceC24681a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC24681a = null;
            }
            return interfaceC24681a.mo128239N1();
        }

        @Override // q90.C25201d.a
        /* renamed from: v1 */
        public void mo72549v1(SelectedItemData selectedItemData, boolean z11) {
            AbstractC19074t.m100208f(selectedItemData, "selectedItemData");
            InterfaceC24681a interfaceC24681a = AttachmentMyCloudQuickPickerView.this.f66830Y0;
            if (interfaceC24681a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC24681a = null;
            }
            interfaceC24681a.mo128246v1(selectedItemData, z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mycloud.AttachmentMyCloudQuickPickerView$d */
    /* loaded from: classes6.dex */
    public static final class C12862d implements ViewPager.InterfaceC6875j {
        C12862d() {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            C25201d c25201d;
            if (i11 == 0 && (c25201d = AttachmentMyCloudQuickPickerView.this.f66829X0) != null) {
                AttachmentMyCloudQuickPickerView attachmentMyCloudQuickPickerView = AttachmentMyCloudQuickPickerView.this;
                C29816g6 c29816g6 = attachmentMyCloudQuickPickerView.f66828W0;
                if (c29816g6 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c29816g6 = null;
                }
                c25201d.m130444B(c29816g6.f137858D.getCurrentItem());
                int mo35335g = c25201d.mo35335g();
                for (int i12 = 0; i12 < mo35335g; i12++) {
                    InterfaceC1801w m93128x = c25201d.m93128x(i12);
                    if (m93128x instanceof InterfaceC24697q) {
                        C29816g6 c29816g62 = attachmentMyCloudQuickPickerView.f66828W0;
                        if (c29816g62 == null) {
                            AbstractC19074t.m100223u("viewBinding");
                            c29816g62 = null;
                        }
                        if (i12 == c29816g62.f137858D.getCurrentItem()) {
                            ((InterfaceC24697q) m93128x).mo72572W3();
                        } else {
                            ((InterfaceC24697q) m93128x).mo72573Y2();
                        }
                    }
                }
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            C25201d c25201d = AttachmentMyCloudQuickPickerView.this.f66829X0;
            if (c25201d != null) {
                c25201d.m130446E(i11);
            }
            C29816g6 c29816g6 = AttachmentMyCloudQuickPickerView.this.f66828W0;
            if (c29816g6 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29816g6 = null;
            }
            TabViewLayout tabViewLayout = c29816g6.f137855A;
            C29816g6 c29816g62 = AttachmentMyCloudQuickPickerView.this.f66828W0;
            if (c29816g62 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29816g62 = null;
            }
            tabViewLayout.m69419g(c29816g62.f137858D.getCurrentItem());
            C29816g6 c29816g63 = AttachmentMyCloudQuickPickerView.this.f66828W0;
            if (c29816g63 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29816g63 = null;
            }
            RobotoTextView[] mTabViewArr = c29816g63.f137855A.getMTabViewArr();
            AttachmentMyCloudQuickPickerView attachmentMyCloudQuickPickerView = AttachmentMyCloudQuickPickerView.this;
            int length = mTabViewArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                RobotoTextView robotoTextView = mTabViewArr[i12];
                int i14 = i13 + 1;
                C29816g6 c29816g64 = attachmentMyCloudQuickPickerView.f66828W0;
                if (c29816g64 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c29816g64 = null;
                }
                if (i13 == c29816g64.f137858D.getCurrentItem()) {
                    if (robotoTextView != null) {
                        robotoTextView.setFontStyle(7);
                    }
                } else if (robotoTextView != null) {
                    robotoTextView.setFontStyle(5);
                }
                i12++;
                i13 = i14;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mycloud.AttachmentMyCloudQuickPickerView$e */
    /* loaded from: classes6.dex */
    public static final class C12863e extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f66839p;

        /* renamed from: q */
        final /* synthetic */ AttachmentMyCloudQuickPickerView f66840q;

        C12863e(boolean z11, AttachmentMyCloudQuickPickerView attachmentMyCloudQuickPickerView) {
            this.f66839p = z11;
            this.f66840q = attachmentMyCloudQuickPickerView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            C29816g6 c29816g6 = null;
            if (!this.f66839p) {
                C29816g6 c29816g62 = this.f66840q.f66828W0;
                if (c29816g62 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                } else {
                    c29816g6 = c29816g62;
                }
                c29816g6.f137860q.setVisibility(8);
                return;
            }
            C29816g6 c29816g63 = this.f66840q.f66828W0;
            if (c29816g63 == null) {
                AbstractC19074t.m100223u("viewBinding");
            } else {
                c29816g6 = c29816g63;
            }
            c29816g6.f137857C.setVisibility(0);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mycloud.AttachmentMyCloudQuickPickerView$f */
    /* loaded from: classes6.dex */
    public static final class C12864f extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ MyCloudMessageItem f66841p;

        /* renamed from: q */
        final /* synthetic */ Rect f66842q;

        /* renamed from: r */
        final /* synthetic */ int[] f66843r;

        /* renamed from: s */
        final /* synthetic */ AttachmentMyCloudQuickPickerView f66844s;

        C12864f(MyCloudMessageItem myCloudMessageItem, Rect rect, int[] iArr, AttachmentMyCloudQuickPickerView attachmentMyCloudQuickPickerView) {
            this.f66841p = myCloudMessageItem;
            this.f66842q = rect;
            this.f66843r = iArr;
            this.f66844s = attachmentMyCloudQuickPickerView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z11) {
            C17487o0 mo35579p;
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator, z11);
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_ITEM", this.f66841p);
            Rect rect = this.f66842q;
            bundle.putSize("EXTRA_THUMB_SIZE", new Size(rect.right - rect.left, rect.bottom - rect.top));
            int[] iArr = this.f66843r;
            bundle.putFloatArray("EXTRA_COORDINATION", new float[]{iArr[0], iArr[1]});
            InterfaceC27218a m92676n2 = this.f66844s.f72421L0.m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                mo35579p.m93069k2(MyCloudMediaViewer.class, bundle, 2, true);
            }
        }
    }

    /* renamed from: AM */
    private final void m72513AM() {
        int m131511r;
        C29816g6 c29816g6 = this.f66828W0;
        C29816g6 c29816g62 = null;
        if (c29816g6 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g6 = null;
        }
        c29816g6.f137855A.setMListener(new C12860b());
        C29816g6 c29816g63 = this.f66828W0;
        if (c29816g63 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g63 = null;
        }
        TabViewLayout tabViewLayout = c29816g63.f137855A;
        InterfaceC24681a interfaceC24681a = this.f66830Y0;
        if (interfaceC24681a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC24681a = null;
        }
        List mo128242a0 = interfaceC24681a.mo128242a0();
        m131511r = AbstractC25370t.m131511r(mo128242a0, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = mo128242a0.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnumC23460e) it.next()).m123172c());
        }
        InterfaceC24681a interfaceC24681a2 = this.f66830Y0;
        if (interfaceC24681a2 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC24681a2 = null;
        }
        tabViewLayout.m69418f(arrayList, interfaceC24681a2.mo128244mc());
        C29816g6 c29816g64 = this.f66828W0;
        if (c29816g64 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g64 = null;
        }
        int i11 = 0;
        for (RobotoTextView robotoTextView : c29816g64.f137855A.getMTabViewArr()) {
            if (robotoTextView != null) {
                robotoTextView.setTextSize(0, this.f66834c1);
            }
        }
        C29816g6 c29816g65 = this.f66828W0;
        if (c29816g65 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g65 = null;
        }
        c29816g65.f137855A.m69419g(0);
        C29816g6 c29816g66 = this.f66828W0;
        if (c29816g66 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c29816g62 = c29816g66;
        }
        RobotoTextView[] mTabViewArr = c29816g62.f137855A.getMTabViewArr();
        int length = mTabViewArr.length;
        int i12 = 0;
        while (i11 < length) {
            RobotoTextView robotoTextView2 = mTabViewArr[i11];
            int i13 = i12 + 1;
            if (i12 == 0) {
                if (robotoTextView2 != null) {
                    robotoTextView2.setFontStyle(7);
                }
            } else if (robotoTextView2 != null) {
                robotoTextView2.setFontStyle(5);
            }
            i11++;
            i12 = i13;
        }
    }

    /* renamed from: BM */
    private final void m72514BM() {
        C29816g6 c29816g6 = this.f66828W0;
        C29816g6 c29816g62 = null;
        if (c29816g6 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g6 = null;
        }
        c29816g6.f137856B.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_my_cloud_picker_title, C21373a.f104231a.m110805u()));
        m72513AM();
        C17487o0 m92693xK = m92693xK();
        InterfaceC24681a interfaceC24681a = this.f66830Y0;
        if (interfaceC24681a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC24681a = null;
        }
        C25201d c25201d = new C25201d(m92693xK, "204278670", interfaceC24681a.mo128242a0());
        c25201d.m130446E(0);
        c25201d.m130445D(new C12861c());
        this.f66829X0 = c25201d;
        C29816g6 c29816g63 = this.f66828W0;
        if (c29816g63 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g63 = null;
        }
        c29816g63.f137858D.setAdapter(this.f66829X0);
        C29816g6 c29816g64 = this.f66828W0;
        if (c29816g64 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g64 = null;
        }
        c29816g64.f137858D.setOffscreenPageLimit(3);
        C29816g6 c29816g65 = this.f66828W0;
        if (c29816g65 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g65 = null;
        }
        c29816g65.f137858D.addOnPageChangeListener(new C12862d());
        C29816g6 c29816g66 = this.f66828W0;
        if (c29816g66 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g66 = null;
        }
        c29816g66.f137862s.setOnClickListener(new View.OnClickListener() { // from class: p90.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AttachmentMyCloudQuickPickerView.m72515CM(AttachmentMyCloudQuickPickerView.this, view);
            }
        });
        C29816g6 c29816g67 = this.f66828W0;
        if (c29816g67 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g67 = null;
        }
        c29816g67.f137866w.setOnClickListener(new View.OnClickListener() { // from class: p90.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AttachmentMyCloudQuickPickerView.m72516DM(AttachmentMyCloudQuickPickerView.this, view);
            }
        });
        C29816g6 c29816g68 = this.f66828W0;
        if (c29816g68 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g68 = null;
        }
        c29816g68.f137863t.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: p90.i
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m72517EM;
                m72517EM = AttachmentMyCloudQuickPickerView.m72517EM(AttachmentMyCloudQuickPickerView.this, textView, i11, keyEvent);
                return m72517EM;
            }
        });
        C29816g6 c29816g69 = this.f66828W0;
        if (c29816g69 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g69 = null;
        }
        c29816g69.f137864u.setOnClickListener(new View.OnClickListener() { // from class: p90.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AttachmentMyCloudQuickPickerView.m72518FM(AttachmentMyCloudQuickPickerView.this, view);
            }
        });
        C29816g6 c29816g610 = this.f66828W0;
        if (c29816g610 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c29816g62 = c29816g610;
        }
        c29816g62.f137861r.setOnClickListener(new View.OnClickListener() { // from class: p90.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AttachmentMyCloudQuickPickerView.m72519GM(AttachmentMyCloudQuickPickerView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m72515CM(AttachmentMyCloudQuickPickerView attachmentMyCloudQuickPickerView, View view) {
        AbstractC19074t.m100208f(attachmentMyCloudQuickPickerView, "this$0");
        attachmentMyCloudQuickPickerView.m72520HM(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m72516DM(AttachmentMyCloudQuickPickerView attachmentMyCloudQuickPickerView, View view) {
        AbstractC19074t.m100208f(attachmentMyCloudQuickPickerView, "this$0");
        attachmentMyCloudQuickPickerView.m72520HM(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final boolean m72517EM(AttachmentMyCloudQuickPickerView attachmentMyCloudQuickPickerView, TextView textView, int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(attachmentMyCloudQuickPickerView, "this$0");
        if (i11 == 3) {
            attachmentMyCloudQuickPickerView.f66832a1 = true;
            C29816g6 c29816g6 = attachmentMyCloudQuickPickerView.f66828W0;
            C29816g6 c29816g62 = null;
            if (c29816g6 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29816g6 = null;
            }
            attachmentMyCloudQuickPickerView.f66833b1 = String.valueOf(c29816g6.f137863t.getText());
            attachmentMyCloudQuickPickerView.m72535yM();
            C29816g6 c29816g63 = attachmentMyCloudQuickPickerView.f66828W0;
            if (c29816g63 == null) {
                AbstractC19074t.m100223u("viewBinding");
            } else {
                c29816g62 = c29816g63;
            }
            AbstractC2379w.m12430d(c29816g62.f137863t);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m72518FM(AttachmentMyCloudQuickPickerView attachmentMyCloudQuickPickerView, View view) {
        AbstractC19074t.m100208f(attachmentMyCloudQuickPickerView, "this$0");
        InterfaceC24681a interfaceC24681a = attachmentMyCloudQuickPickerView.f66830Y0;
        if (interfaceC24681a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC24681a = null;
        }
        interfaceC24681a.mo128243bc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m72519GM(AttachmentMyCloudQuickPickerView attachmentMyCloudQuickPickerView, View view) {
        AbstractC19074t.m100208f(attachmentMyCloudQuickPickerView, "this$0");
        attachmentMyCloudQuickPickerView.close();
    }

    /* renamed from: HM */
    private final void m72520HM(boolean z11) {
        int i11;
        InterfaceC1801w interfaceC1801w;
        C29816g6 c29816g6 = null;
        if (z11) {
            if (this.f72454M0.getTranslationY() != 0.0f) {
                this.f72454M0.setTranslationY(0.0f);
                this.f72454M0.setViewTranslationY(0.0f);
            }
            this.f72827B0.postDelayed(new Runnable() { // from class: p90.l
                @Override // java.lang.Runnable
                public final void run() {
                    AttachmentMyCloudQuickPickerView.m72521IM(AttachmentMyCloudQuickPickerView.this);
                }
            }, 100L);
            C29816g6 c29816g62 = this.f66828W0;
            if (c29816g62 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29816g62 = null;
            }
            c29816g62.f137863t.setText("");
            C29816g6 c29816g63 = this.f66828W0;
            if (c29816g63 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29816g63 = null;
            }
            c29816g63.f137862s.setVisibility(8);
            C29816g6 c29816g64 = this.f66828W0;
            if (c29816g64 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29816g64 = null;
            }
            c29816g64.f137856B.setVisibility(8);
            C29816g6 c29816g65 = this.f66828W0;
            if (c29816g65 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29816g65 = null;
            }
            c29816g65.f137866w.setVisibility(0);
            C29816g6 c29816g66 = this.f66828W0;
            if (c29816g66 == null) {
                AbstractC19074t.m100223u("viewBinding");
            } else {
                c29816g6 = c29816g66;
            }
            c29816g6.f137863t.setVisibility(0);
            return;
        }
        this.f66832a1 = false;
        this.f66833b1 = "";
        C29816g6 c29816g67 = this.f66828W0;
        if (c29816g67 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g67 = null;
        }
        c29816g67.f137862s.setVisibility(0);
        C29816g6 c29816g68 = this.f66828W0;
        if (c29816g68 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g68 = null;
        }
        c29816g68.f137856B.setVisibility(0);
        C29816g6 c29816g69 = this.f66828W0;
        if (c29816g69 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g69 = null;
        }
        c29816g69.f137866w.setVisibility(8);
        C29816g6 c29816g610 = this.f66828W0;
        if (c29816g610 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g610 = null;
        }
        c29816g610.f137863t.setVisibility(8);
        C29816g6 c29816g611 = this.f66828W0;
        if (c29816g611 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g611 = null;
        }
        AbstractC2379w.m12430d(c29816g611.f137863t);
        C25201d c25201d = this.f66829X0;
        if (c25201d != null) {
            i11 = c25201d.mo35335g();
        } else {
            i11 = 0;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            C25201d c25201d2 = this.f66829X0;
            if (c25201d2 != null) {
                interfaceC1801w = c25201d2.m93128x(i12);
            } else {
                interfaceC1801w = null;
            }
            if (interfaceC1801w instanceof InterfaceC24697q) {
                ((InterfaceC24697q) interfaceC1801w).mo72569Kb();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public static final void m72521IM(AttachmentMyCloudQuickPickerView attachmentMyCloudQuickPickerView) {
        AbstractC19074t.m100208f(attachmentMyCloudQuickPickerView, "this$0");
        C29816g6 c29816g6 = attachmentMyCloudQuickPickerView.f66828W0;
        C29816g6 c29816g62 = null;
        if (c29816g6 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g6 = null;
        }
        c29816g6.f137863t.requestFocus();
        C29816g6 c29816g63 = attachmentMyCloudQuickPickerView.f66828W0;
        if (c29816g63 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c29816g62 = c29816g63;
        }
        AbstractC2379w.m12432f(c29816g62.f137863t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public final void m72522JM(MyCloudMessageItem myCloudMessageItem, C16719g c16719g) {
        if (c16719g == null) {
            return;
        }
        int[] iArr = new int[2];
        c16719g.m89119T().getLocationOnScreen(iArr);
        Rect rect = new Rect();
        int i11 = iArr[0];
        rect.left = i11;
        rect.top = iArr[1];
        rect.right = i11 + c16719g.m89114P();
        rect.bottom = rect.top + c16719g.m89112O();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c16719g, "scaleX", 1.0f, 0.75f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c16719g, "scaleY", 1.0f, 0.75f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setInterpolator(new C26087b());
        animatorSet.addListener(new C12864f(myCloudMessageItem, rect, iArr, this));
        animatorSet.start();
    }

    /* renamed from: yM */
    private final void m72535yM() {
        int i11;
        InterfaceC1801w interfaceC1801w;
        C25201d c25201d = this.f66829X0;
        if (c25201d != null) {
            i11 = c25201d.mo35335g();
        } else {
            i11 = 0;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            C25201d c25201d2 = this.f66829X0;
            C29816g6 c29816g6 = null;
            if (c25201d2 != null) {
                interfaceC1801w = c25201d2.m93128x(i12);
            } else {
                interfaceC1801w = null;
            }
            if (interfaceC1801w instanceof InterfaceC24697q) {
                InterfaceC24697q interfaceC24697q = (InterfaceC24697q) interfaceC1801w;
                C29816g6 c29816g62 = this.f66828W0;
                if (c29816g62 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                } else {
                    c29816g6 = c29816g62;
                }
                interfaceC24697q.mo72574m0(String.valueOf(c29816g6.f137863t.getText()));
            }
        }
    }

    /* renamed from: zM */
    private final List m72536zM() {
        ArrayList arrayList = new ArrayList();
        C29816g6 c29816g6 = this.f66828W0;
        if (c29816g6 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g6 = null;
        }
        RelativeLayout relativeLayout = c29816g6.f137860q;
        AbstractC19074t.m100207e(relativeLayout, "bottomViewContainer");
        arrayList.add(relativeLayout);
        return arrayList;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f66835d1 = new C13306b(this.f72421L0.m92648SI());
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        C13306b c13306b = this.f66835d1;
        if (c13306b != null) {
            c13306b.m74701i();
        }
    }

    @Override // p90.InterfaceC24682b
    /* renamed from: Jq */
    public void mo72537Jq(int i11) {
        C29816g6 c29816g6 = this.f66828W0;
        if (c29816g6 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g6 = null;
        }
        c29816g6.f137857C.setText(String.valueOf(i11));
    }

    @Override // p90.InterfaceC24682b
    /* renamed from: O6 */
    public void mo72538O6(String str, int i11) {
        AbstractC19074t.m100208f(str, "tipCat");
        C13306b c13306b = this.f66835d1;
        if (c13306b != null) {
            c13306b.m74711w(str, i11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        C29816g6 c29816g6 = this.f66828W0;
        if (c29816g6 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g6 = null;
        }
        RelativeLayout root = c29816g6.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // p90.InterfaceC24682b
    /* renamed from: Sf */
    public void mo72539Sf(boolean z11) {
        float f11;
        float f12 = 1.0f;
        if (z11) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        if (!z11) {
            f12 = 0.0f;
        }
        C29816g6 c29816g6 = this.f66828W0;
        C29816g6 c29816g62 = null;
        if (c29816g6 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g6 = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c29816g6.f137864u, "scaleX", f11, f12);
        C29816g6 c29816g63 = this.f66828W0;
        if (c29816g63 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g63 = null;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c29816g63.f137864u, "scaleY", f11, f12);
        if (z11) {
            C29816g6 c29816g64 = this.f66828W0;
            if (c29816g64 == null) {
                AbstractC19074t.m100223u("viewBinding");
            } else {
                c29816g62 = c29816g64;
            }
            c29816g62.f137860q.setVisibility(0);
        } else {
            C29816g6 c29816g65 = this.f66828W0;
            if (c29816g65 == null) {
                AbstractC19074t.m100223u("viewBinding");
            } else {
                c29816g62 = c29816g65;
            }
            c29816g62.f137857C.setVisibility(8);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new C12863e(z11, this));
        animatorSet.start();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: T2 */
    public void mo42955T2(float f11) {
        boolean z11;
        super.mo42955T2(f11);
        BottomSheetLayout bottomSheetLayout = this.f72454M0;
        if (bottomSheetLayout.getTranslationY() == this.f72454M0.f68983q) {
            z11 = true;
        } else {
            z11 = false;
        }
        bottomSheetLayout.setEnableScrollY(z11);
        Iterator it = m72536zM().iterator();
        while (it.hasNext()) {
            ((View) it.next()).setTranslationY(-f11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C13306b c13306b = this.f66835d1;
        if (c13306b != null) {
            InterfaceC24681a interfaceC24681a = this.f66830Y0;
            if (interfaceC24681a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC24681a = null;
            }
            c13306b.m74697c(interfaceC24681a.mo128245po());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        InterfaceC24681a interfaceC24681a = this.f66830Y0;
        if (interfaceC24681a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC24681a = null;
        }
        interfaceC24681a.mo128241T(z11, z12);
    }

    @Override // p90.InterfaceC24682b
    /* renamed from: Yq */
    public void mo72540Yq(String str, String str2) {
        AbstractC19074t.m100208f(str, "tab");
        AbstractC19074t.m100208f(str2, "tabTitle");
        C29816g6 c29816g6 = this.f66828W0;
        if (c29816g6 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g6 = null;
        }
        c29816g6.f137855A.m69417e(str, str2);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim
    public void close() {
        super.close();
        InterfaceC24681a interfaceC24681a = this.f66830Y0;
        if (interfaceC24681a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC24681a = null;
        }
        interfaceC24681a.mo128238J();
    }

    @Override // p90.InterfaceC24682b
    /* renamed from: eG */
    public boolean mo72541eG() {
        if (this.f72421L0.m92672lJ() && this.f72421L0.m92687sJ()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        return AbstractC23136l9.m118742r(300.0f);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        C29816g6 m147984c = C29816g6.m147984c(LayoutInflater.from(getContext()), this.f72454M0, true);
        AbstractC19074t.m100207e(m147984c, "inflate(...)");
        this.f66828W0 = m147984c;
        if (linearLayout != null) {
            linearLayout.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.album_list_bottom_sheet_background));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        super.mo37132gM();
        this.f72454M0.setEnableScrollY(false);
    }

    @Override // p90.InterfaceC24682b
    public View getRootView() {
        C29816g6 c29816g6 = this.f66828W0;
        if (c29816g6 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29816g6 = null;
        }
        RelativeLayout root = c29816g6.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MyCloudQuickPickerView";
    }

    @Override // p90.InterfaceC24682b
    /* renamed from: md */
    public void mo72542md(Intent intent) {
        AbstractC19074t.m100208f(intent, "intent");
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            m92650VI.mo50035CK(100, intent);
        }
        close();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim, com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: x3 */
    public void mo72543x3() {
        close();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f66830Y0 = new C24686f(this);
        this.f66831Z0 = C12869a.Companion.m72568a(m92642L3());
        InterfaceC24681a interfaceC24681a = this.f66830Y0;
        if (interfaceC24681a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC24681a = null;
        }
        C12869a c12869a = this.f66831Z0;
        if (c12869a == null) {
            AbstractC19074t.m100223u("args");
            c12869a = null;
        }
        interfaceC24681a.mo995Nd(c12869a, null);
        m72514BM();
    }
}
