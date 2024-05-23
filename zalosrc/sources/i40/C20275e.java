package i40;

import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.C2370r0;
import com.androidquery.util.C3979l;
import com.showingphotolib.view.AnimationLayout;
import com.showingphotolib.view.SimpleAnimationTarget;
import com.showingphotolib.view.ViewAnimationTarget;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.feed.components.FeedItemGroupHorizontal;
import com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView;
import com.zing.zalo.feed.uicontrols.FeedGridModulesView;
import com.zing.zalo.feed.uicontrols.FeedGridView;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiPhotos;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowPhoto;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowPhotoSticker;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline;
import com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0;
import com.zing.zalo.p077ui.mycloud.gridtab.PhotoGridChatItemView;
import com.zing.zalo.p077ui.widget.recyclerview.TouchListView;
import com.zing.zalo.p077ui.zviews.ProfileCardView;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.animation.AnimationTarget;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import me0.AbstractC23171p0;
import mm0.AbstractC23350e;
import p716zh.C31995kc;
import xl0.InterfaceC30162c;

/* renamed from: i40.e */
/* loaded from: classes5.dex */
public class C20275e implements InterfaceC30162c {

    /* renamed from: b */
    private SparseIntArray f100183b;

    /* renamed from: c */
    private SparseIntArray f100184c;

    /* renamed from: d */
    private SparseIntArray f100185d;

    /* renamed from: e */
    private C2370r0 f100186e;

    /* renamed from: q */
    private SparseArray f100198q;

    /* renamed from: t */
    private C3979l f100201t;

    /* renamed from: v */
    View f100203v;

    /* renamed from: w */
    C2370r0 f100204w;

    /* renamed from: a */
    private final String f100182a = getClass().getSimpleName();

    /* renamed from: f */
    private boolean f100187f = false;

    /* renamed from: g */
    private boolean f100188g = false;

    /* renamed from: h */
    private boolean f100189h = false;

    /* renamed from: i */
    private int f100190i = 0;

    /* renamed from: j */
    private int f100191j = 0;

    /* renamed from: k */
    private boolean f100192k = false;

    /* renamed from: l */
    private final boolean f100193l = false;

    /* renamed from: m */
    private boolean f100194m = false;

    /* renamed from: n */
    private ZaloView f100195n = null;

    /* renamed from: o */
    private String f100196o = "";

    /* renamed from: p */
    private float f100197p = 0.0f;

    /* renamed from: r */
    private boolean f100199r = true;

    /* renamed from: s */
    private int f100200s = -1;

    /* renamed from: u */
    boolean f100202u = false;

    /* renamed from: x */
    int f100205x = -1;

    /* renamed from: y */
    MessageId f100206y = null;

    /* renamed from: i40.e$a */
    /* loaded from: classes5.dex */
    class a extends SimpleAnimationTarget {

        /* renamed from: p */
        final /* synthetic */ int f100207p;

        a(int i11) {
            this.f100207p = i11;
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            return ((ProfileCardView) C20275e.this.f100186e.m12394a()).m83025i(this.f100207p);
        }
    }

    /* renamed from: i40.e$b */
    /* loaded from: classes5.dex */
    class b extends SimpleAnimationTarget {

        /* renamed from: p */
        final /* synthetic */ int f100209p;

        b(int i11) {
            this.f100209p = i11;
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            return ((ChatRowMultiPhotos) C20275e.this.f100203v).m61502s4(this.f100209p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i40.e$c */
    /* loaded from: classes5.dex */
    public class c extends SimpleAnimationTarget {

        /* renamed from: p */
        final /* synthetic */ View f100211p;

        /* renamed from: q */
        final /* synthetic */ int f100212q;

        c(View view, int i11) {
            this.f100211p = view;
            this.f100212q = i11;
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            return ((InterfaceC20272b) this.f100211p).mo43986q(this.f100212q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i40.e$d */
    /* loaded from: classes5.dex */
    public class d extends SimpleAnimationTarget {

        /* renamed from: p */
        final /* synthetic */ View f100214p;

        /* renamed from: q */
        final /* synthetic */ int f100215q;

        d(View view, int i11) {
            this.f100214p = view;
            this.f100215q = i11;
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            return ((InterfaceC20272b) this.f100214p).mo43986q(this.f100215q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i40.e$e */
    /* loaded from: classes5.dex */
    public class e extends SimpleAnimationTarget {

        /* renamed from: p */
        final /* synthetic */ View f100217p;

        /* renamed from: q */
        final /* synthetic */ int f100218q;

        e(View view, int i11) {
            this.f100217p = view;
            this.f100218q = i11;
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            return ((ChatRowMultiPhotos) this.f100217p).m61502s4(this.f100218q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i40.e$f */
    /* loaded from: classes5.dex */
    public class f extends SimpleAnimationTarget {

        /* renamed from: p */
        final /* synthetic */ View f100220p;

        f(View view) {
            this.f100220p = view;
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            Rect referenceThumbPosition = ((InterfaceC11475g0) this.f100220p).getReferenceThumbPosition();
            if (referenceThumbPosition != null) {
                int[] iArr = new int[2];
                this.f100220p.getLocationOnScreen(iArr);
                this.f100220p.setTag("");
                int i11 = iArr[0];
                int i12 = referenceThumbPosition.left;
                return new Rect(i11 + i12, iArr[1] + referenceThumbPosition.top, i11 + i12 + referenceThumbPosition.width(), iArr[1] + referenceThumbPosition.top + referenceThumbPosition.height());
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x0010, B:8:0x0014, B:10:0x0019, B:12:0x0025, B:14:0x0033, B:19:0x003d, B:21:0x0041, B:23:0x0049, B:25:0x0054, B:30:0x005b, B:32:0x0069, B:34:0x006d, B:35:0x007b, B:38:0x0086, B:40:0x008a, B:42:0x008e, B:44:0x0092, B:46:0x0096, B:49:0x009b, B:50:0x00a4, B:52:0x00aa, B:55:0x00a1, B:56:0x00b0, B:58:0x00b4, B:60:0x00bc), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m105853n(AnimationLayout animationLayout) {
        AnimationTarget animationTarget;
        int i11;
        int i12;
        try {
            View mo43942d = mo43942d(this.f100200s);
            if (mo43942d != 0 && this.f100201t.m18839c() != null) {
                if (mo43942d instanceof InterfaceC20272b) {
                    if (!this.f100194m) {
                        int m105854r = m105854r(m105880q(this.f100200s));
                        if (m105854r != -1) {
                            c cVar = new c(mo43942d, this.f100200s - m105854r);
                            if (cVar.getAnimTargetLocationOnScreen() != null) {
                                animationLayout.shrink(cVar, this.f100201t);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    SparseIntArray sparseIntArray = this.f100185d;
                    if (sparseIntArray != null && (i12 = sparseIntArray.get(this.f100200s, -1)) != -1) {
                        d dVar = new d(mo43942d, i12);
                        if (dVar.getAnimTargetLocationOnScreen() != null) {
                            animationLayout.shrink(dVar, this.f100201t);
                            return;
                        }
                        return;
                    }
                    return;
                }
                animationLayout.setClipTopHeight(this.f100190i);
                animationLayout.setClipBottomHeight(this.f100191j);
                if (mo43942d instanceof ChatRowMultiPhotos) {
                    SparseArray sparseArray = this.f100198q;
                    if (sparseArray != null) {
                        i11 = mo60386k((MessageId) sparseArray.get(this.f100200s));
                    } else {
                        i11 = 0;
                    }
                    animationLayout.shrink(new e(mo43942d, i11), this.f100201t);
                    return;
                }
                if (mo43942d instanceof InterfaceC11475g0) {
                    if (!(mo43942d instanceof ChatRowPhoto) && !(mo43942d instanceof ChatRowPhotoSticker) && !(mo43942d instanceof ChatRowVideoInline) && !(mo43942d instanceof PhotoGridChatItemView)) {
                        animationTarget = new f(mo43942d);
                        if (animationTarget.getAnimTargetLocationOnScreen() == null) {
                            animationLayout.shrink(animationTarget, this.f100201t);
                            return;
                        }
                        return;
                    }
                    animationTarget = (InterfaceC11475g0) mo43942d;
                    if (animationTarget.getAnimTargetLocationOnScreen() == null) {
                    }
                } else if (mo43942d instanceof AnimationTarget) {
                    animationLayout.shrink((AnimationTarget) mo43942d, this.f100201t);
                } else {
                    animationLayout.shrink(new ViewAnimationTarget(mo43942d), this.f100201t);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104543l(this.f100182a).mo104552e(e11);
        }
    }

    /* renamed from: r */
    private int m105854r(int i11) {
        SparseIntArray sparseIntArray = this.f100184c;
        if (sparseIntArray == null || sparseIntArray.get(i11, -1) <= -1) {
            return -1;
        }
        return this.f100184c.get(i11);
    }

    /* renamed from: A */
    public void m105855A(boolean z11) {
        this.f100194m = z11;
    }

    /* renamed from: B */
    public void m105856B(SparseIntArray sparseIntArray) {
        this.f100185d = sparseIntArray;
    }

    /* renamed from: C */
    public void m105857C(SparseIntArray sparseIntArray) {
        this.f100183b = sparseIntArray;
    }

    /* renamed from: D */
    public void m105858D(SparseIntArray sparseIntArray) {
        this.f100184c = sparseIntArray;
    }

    /* renamed from: E */
    public void m105859E(SparseArray sparseArray) {
        this.f100198q = sparseArray;
    }

    /* renamed from: F */
    public void m105860F(View view) {
        this.f100202u = true;
        this.f100203v = view;
        C2370r0 c2370r0 = new C2370r0((View) view.getParent());
        this.f100204w = c2370r0;
        this.f100205x = -1;
        if (this.f100203v != null && c2370r0.m12394a() != null) {
            if (this.f100204w.m12394a() instanceof TouchListView) {
                this.f100205x = ((TouchListView) this.f100204w.m12394a()).m9817A0(this.f100203v);
            }
            if (this.f100204w.m12394a() instanceof ListView) {
                this.f100205x = ((ListView) this.f100204w.m12394a()).getPositionForView(this.f100203v);
            }
            if (this.f100204w.m12394a() instanceof RecyclerView) {
                this.f100205x = ((RecyclerView) this.f100204w.m12394a()).m9820B0(this.f100203v);
            }
        }
    }

    /* renamed from: G */
    public void m105861G(C2370r0 c2370r0) {
        this.f100186e = c2370r0;
    }

    /* renamed from: H */
    public void m105862H(float f11) {
        this.f100197p = f11;
    }

    /* renamed from: I */
    public void m105863I(boolean z11) {
        this.f100199r = z11;
    }

    /* renamed from: J */
    public void m105864J(C3979l c3979l) {
        this.f100201t = c3979l;
    }

    /* renamed from: K */
    public void m105865K(int i11) {
        this.f100200s = i11;
    }

    /* renamed from: L */
    public void m105866L(int i11) {
        ViewPager viewPager;
        int i12;
        int i13 = this.f100200s;
        this.f100200s = i11;
        if (!this.f100189h) {
            int m105880q = m105880q(i11);
            if (m105880q != m105880q(i13) && m105880q >= 0) {
                int mo36887h = mo36887h(m105880q);
                C2370r0 c2370r0 = this.f100186e;
                if (c2370r0 != null && (c2370r0.m12394a() instanceof AdapterView)) {
                    AdapterView adapterView = (AdapterView) this.f100186e.m12394a();
                    if (adapterView instanceof ListView) {
                        i12 = ((ListView) adapterView).getHeaderViewsCount();
                    } else {
                        i12 = 0;
                    }
                    int max = Math.max(adapterView.getFirstVisiblePosition() - i12, 0);
                    int max2 = Math.max(adapterView.getLastVisiblePosition() - i12, 0);
                    if (mo36887h <= max || mo36887h >= max2) {
                        adapterView.setSelection(mo36887h);
                    }
                }
                C2370r0 c2370r02 = this.f100186e;
                if (c2370r02 != null && (c2370r02.m12394a() instanceof TouchListView)) {
                    TouchListView touchListView = (TouchListView) this.f100186e.m12394a();
                    int firstVisiblePosition = touchListView.getFirstVisiblePosition();
                    int lastVisiblePosition = touchListView.getLastVisiblePosition();
                    if (mo36887h <= firstVisiblePosition || mo36887h >= lastVisiblePosition) {
                        touchListView.m76941C2(touchListView.getHeaderViewsCount() + mo36887h, 0);
                    }
                } else {
                    C2370r0 c2370r03 = this.f100186e;
                    if (c2370r03 != null && (c2370r03.m12394a() instanceof RecyclerView)) {
                        ((RecyclerView) this.f100186e.m12394a()).mo9854S1(mo36887h);
                    }
                }
                C2370r0 c2370r04 = this.f100186e;
                if (c2370r04 != null) {
                    if (c2370r04.m12394a() instanceof ViewPager) {
                        viewPager = (ViewPager) this.f100186e.m12394a();
                    } else if (this.f100186e.m12394a() instanceof FeedItemGroupHorizontal) {
                        viewPager = ((FeedItemGroupHorizontal) this.f100186e.m12394a()).getPager();
                    } else {
                        viewPager = null;
                    }
                    if (viewPager == null) {
                        return;
                    }
                    int currentItem = viewPager.getCurrentItem();
                    if (viewPager.getChildAt(0) != null && (viewPager.getChildAt(0) instanceof ViewGroup)) {
                        ViewGroup viewGroup = (ViewGroup) viewPager.getChildAt(0);
                        for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                            if (viewGroup.getChildAt(i14) instanceof FeedGridView) {
                                FeedGridView feedGridView = (FeedGridView) viewGroup.getChildAt(i14);
                                if (feedGridView.getChildCount() > 0) {
                                    mo36887h = i11 / feedGridView.getChildCount();
                                }
                            }
                        }
                    }
                    if (mo36887h != currentItem) {
                        viewPager.setCurrentItem(mo36887h);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C2370r0 c2370r05 = this.f100186e;
        if (c2370r05 != null && (c2370r05.m12394a() instanceof FeedItemPhotoMultiModuleView)) {
            ((FeedItemPhotoMultiModuleView) this.f100186e.m12394a()).m43982f1(i11);
        }
        C2370r0 c2370r06 = this.f100186e;
        if (c2370r06 != null && (c2370r06.m12394a() instanceof FeedGridModulesView)) {
            ((FeedGridModulesView) this.f100186e.m12394a()).m47300b0(i11);
        }
    }

    /* renamed from: M */
    public void m105867M(MessageId messageId) {
        this.f100206y = messageId;
    }

    /* renamed from: N */
    public void m105868N(ZaloView zaloView) {
        this.f100195n = zaloView;
    }

    /* renamed from: O */
    public void m105869O(int i11) {
        SparseIntArray sparseIntArray;
        int indexOfKey;
        try {
            if (mo36888s() && (sparseIntArray = this.f100183b) != null && (indexOfKey = sparseIntArray.indexOfKey(i11)) > 0) {
                while (indexOfKey < this.f100183b.size() - 1) {
                    int keyAt = this.f100183b.keyAt(indexOfKey);
                    indexOfKey++;
                    this.f100183b.put(keyAt, this.f100183b.valueAt(indexOfKey));
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104543l(this.f100182a).mo104552e(e11);
        }
    }

    /* renamed from: b */
    public int m105870b() {
        return this.f100191j;
    }

    /* renamed from: c */
    public int m105871c() {
        return this.f100190i;
    }

    /* renamed from: d */
    public View mo43942d(int i11) {
        C2370r0 c2370r0 = this.f100186e;
        if (c2370r0 == null || c2370r0.m12394a() == null) {
            return null;
        }
        if (this.f100192k && (this.f100186e.m12394a() instanceof TouchListView)) {
            int m105880q = m105880q(i11);
            if (m105880q < 0) {
                return null;
            }
            TouchListView touchListView = (TouchListView) this.f100186e.m12394a();
            int firstVisiblePosition = touchListView.getFirstVisiblePosition() - touchListView.getHeaderViewsCount();
            int childCount = (touchListView.getChildCount() + firstVisiblePosition) - 1;
            if (m105880q >= firstVisiblePosition && m105880q <= childCount) {
                return touchListView.getChildAt(m105880q - firstVisiblePosition);
            }
        }
        return ((View) this.f100186e.m12394a()).findViewWithTag(mo72438e(i11));
    }

    /* renamed from: e */
    public String mo72438e(int i11) {
        return String.format("image#%s", Integer.valueOf(m105880q(i11)));
    }

    /* renamed from: f */
    public SparseIntArray m105872f() {
        return this.f100183b;
    }

    /* renamed from: g */
    public SparseArray m105873g() {
        return this.f100198q;
    }

    /* renamed from: h */
    public int mo36887h(int i11) {
        return i11;
    }

    /* renamed from: i */
    public float m105874i() {
        return this.f100197p;
    }

    /* renamed from: j */
    public int m105875j() {
        return this.f100200s;
    }

    /* renamed from: k */
    public int mo60386k(MessageId messageId) {
        return 0;
    }

    /* renamed from: l */
    public ZaloView m105876l() {
        return this.f100195n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public void m105877m(AnimationLayout animationLayout) {
        C3979l c3979l;
        MessageId messageId;
        C3979l c3979l2;
        try {
            if (!this.f100202u) {
                if (this.f100200s > -1 && (c3979l2 = this.f100201t) != null && c3979l2.m18849m()) {
                    int i11 = this.f100200s;
                    C2370r0 c2370r0 = this.f100186e;
                    if (c2370r0 != null && (c2370r0.m12394a() instanceof ProfileCardView)) {
                        a aVar = new a(i11);
                        if (aVar.getAnimTargetLocationOnScreen() != null) {
                            animationLayout.shrink(aVar, this.f100201t);
                        }
                    } else {
                        m105853n(animationLayout);
                    }
                    this.f100200s = -1;
                    this.f100201t = null;
                }
            } else {
                if (this.f100203v != null && m105879p() && (c3979l = this.f100201t) != null && c3979l.m18849m() && this.f100201t.m18839c() != null) {
                    View view = this.f100203v;
                    if (view instanceof AnimationTarget) {
                        AnimationTarget animationTarget = (AnimationTarget) view;
                        if ((view instanceof ChatRowMultiPhotos) && (messageId = this.f100206y) != null) {
                            animationTarget = new b(mo60386k(messageId));
                        }
                        animationLayout.shrink(animationTarget, this.f100201t);
                    } else {
                        animationLayout.shrink(new ViewAnimationTarget(view), this.f100201t);
                    }
                    this.f100206y = null;
                }
                this.f100201t = null;
            }
            C31995kc.m154255c().m154259e(this.f100196o);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f100182a, e11);
        }
    }

    /* renamed from: o */
    public boolean m105878o() {
        if (!AbstractC23171p0.m119371c() && !AbstractC23136l9.m118654H0(MainApplication.getAppContext())) {
            return this.f100187f;
        }
        return true;
    }

    /* renamed from: p */
    boolean m105879p() {
        C2370r0 c2370r0;
        if (this.f100203v == null || (c2370r0 = this.f100204w) == null || c2370r0.m12394a() == null) {
            return false;
        }
        if (this.f100204w.m12394a() instanceof TouchListView) {
            TouchListView touchListView = (TouchListView) this.f100204w.m12394a();
            if (this.f100205x >= touchListView.getFirstVisiblePosition() && this.f100205x <= touchListView.getLastVisiblePosition()) {
                return true;
            }
        }
        if (this.f100204w.m12394a() instanceof ListView) {
            ListView listView = (ListView) this.f100204w.m12394a();
            if (this.f100205x >= listView.getFirstVisiblePosition() && this.f100205x <= listView.getLastVisiblePosition()) {
                return true;
            }
        }
        if (!(this.f100204w.m12394a() instanceof RecyclerView)) {
            return false;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((RecyclerView) this.f100204w.m12394a()).getLayoutManager();
        if (this.f100205x < linearLayoutManager.m9740Y1() || this.f100205x > linearLayoutManager.m9745c2()) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public int m105880q(int i11) {
        SparseIntArray sparseIntArray = this.f100183b;
        if (sparseIntArray != null && sparseIntArray.get(i11, -1) > -1) {
            return this.f100183b.get(i11);
        }
        if (!this.f100199r) {
            return -1;
        }
        return i11;
    }

    /* renamed from: s */
    public boolean mo36888s() {
        return false;
    }

    /* renamed from: t */
    public void m105881t(int i11) {
        this.f100191j = i11;
    }

    /* renamed from: u */
    public void m105882u(int i11) {
        this.f100190i = i11;
        if (i11 > 0) {
            this.f100190i = i11 + AbstractC17484n.Companion.m92931b();
        }
    }

    /* renamed from: v */
    public void m105883v(boolean z11) {
        this.f100187f = z11;
    }

    /* renamed from: w */
    public void m105884w(String str) {
        this.f100196o = str;
    }

    /* renamed from: x */
    public void m105885x(boolean z11) {
        this.f100188g = z11;
    }

    /* renamed from: y */
    public void m105886y(boolean z11) {
        this.f100189h = z11;
    }

    /* renamed from: z */
    public void m105887z(boolean z11) {
        this.f100192k = z11;
    }
}
