package com.zing.zalo.p077ui.widget.poll;

import ae.C0766k;
import am.C0943w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7082h2;
import com.zing.zalo.adapters.GroupPollOptionsDetailRecyclerAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.p077ui.widget.PagerSlidingTabStrip;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.poll.GroupPollOptionsDetailView;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloView;
import com.zing.zalo.p077ui.zviews.GroupPollVotingView;
import com.zing.zalo.p077ui.zviews.QuickCreateGroupView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23211s7;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p500s1.C26086a;
import p500s1.C26088c;
import p716zh.C31961i8;
import p716zh.C31973j5;
import p716zh.C32076q5;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import vg.C28203u6;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class GroupPollOptionsDetailView extends RelativeLayout {
    public static final C13713a Companion = new C13713a(null);

    /* renamed from: A */
    private final C31973j5 f70932A;

    /* renamed from: B */
    private final String f70933B;

    /* renamed from: C */
    private int f70934C;

    /* renamed from: D */
    private final GroupPollOptionsDetailRecyclerAdapter.InterfaceC6959a f70935D;

    /* renamed from: E */
    private final InterfaceC13714b f70936E;

    /* renamed from: F */
    private AnimatorSet f70937F;

    /* renamed from: G */
    private String f70938G;

    /* renamed from: p */
    private final Context f70939p;

    /* renamed from: q */
    private ZaloView f70940q;

    /* renamed from: r */
    private final String f70941r;

    /* renamed from: s */
    private final String f70942s;

    /* renamed from: t */
    private final String f70943t;

    /* renamed from: u */
    private GroupPollOptionsDetailBottomView f70944u;

    /* renamed from: v */
    public View f70945v;

    /* renamed from: w */
    public View f70946w;

    /* renamed from: x */
    public RobotoTextView f70947x;

    /* renamed from: y */
    private int f70948y;

    /* renamed from: z */
    private boolean f70949z;

    /* loaded from: classes6.dex */
    public static final class GroupPollOptionsDetailBottomView extends BottomSheetZaloView implements View.OnClickListener {
        public static final C13708a Companion = new C13708a(null);

        /* renamed from: f1 */
        private static final int f70950f1 = AbstractC23136l9.m118742r(320.0f);

        /* renamed from: P0 */
        private final Handler f70951P0 = new Handler(Looper.getMainLooper());

        /* renamed from: Q0 */
        public View f70952Q0;

        /* renamed from: R0 */
        public ViewGroup f70953R0;

        /* renamed from: S0 */
        public MultiStateView f70954S0;

        /* renamed from: T0 */
        private GroupPollOptionsDetailView f70955T0;

        /* renamed from: U0 */
        private final InterfaceC24854k f70956U0;

        /* renamed from: V0 */
        private boolean f70957V0;

        /* renamed from: W0 */
        private boolean f70958W0;

        /* renamed from: X0 */
        public ViewPager f70959X0;

        /* renamed from: Y0 */
        private C7082h2 f70960Y0;

        /* renamed from: Z0 */
        private boolean f70961Z0;

        /* renamed from: a1 */
        private boolean f70962a1;

        /* renamed from: b1 */
        private HashSet f70963b1;

        /* renamed from: c1 */
        private View f70964c1;

        /* renamed from: d1 */
        private AnimatorSet f70965d1;

        /* renamed from: e1 */
        private boolean f70966e1;

        /* renamed from: com.zing.zalo.ui.widget.poll.GroupPollOptionsDetailView$GroupPollOptionsDetailBottomView$a */
        /* loaded from: classes6.dex */
        public static final class C13708a {
            private C13708a() {
            }

            public /* synthetic */ C13708a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: com.zing.zalo.ui.widget.poll.GroupPollOptionsDetailView$GroupPollOptionsDetailBottomView$b */
        /* loaded from: classes6.dex */
        public static final class C13709b implements ViewPager.InterfaceC6875j {
            C13709b() {
            }

            @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
            public void onPageScrollStateChanged(int i11) {
            }

            @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
            public void onPageScrolled(int i11, float f11, int i12) {
            }

            @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
            public void onPageSelected(int i11) {
                GroupPollOptionsDetailBottomView.this.m76663nM(i11);
            }
        }

        /* renamed from: com.zing.zalo.ui.widget.poll.GroupPollOptionsDetailView$GroupPollOptionsDetailBottomView$c */
        /* loaded from: classes6.dex */
        public static final class C13710c implements InterfaceC20094a {
            C13710c() {
            }

            /* renamed from: d */
            public static final void m76675d(GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView, ArrayList arrayList, HashSet hashSet, C31961i8.a aVar) {
                boolean z11;
                AbstractC19074t.m100208f(groupPollOptionsDetailBottomView, "this$0");
                AbstractC19074t.m100208f(arrayList, "$options");
                AbstractC19074t.m100208f(hashSet, "$votedUids");
                groupPollOptionsDetailBottomView.m76673zM().clear();
                groupPollOptionsDetailBottomView.m76673zM().addAll(arrayList);
                groupPollOptionsDetailBottomView.m76653LM(new HashSet(hashSet));
                if (aVar != null) {
                    groupPollOptionsDetailBottomView.m76673zM().add(aVar);
                    z11 = true;
                } else {
                    z11 = false;
                }
                groupPollOptionsDetailBottomView.m76657RM(z11);
                groupPollOptionsDetailBottomView.m76650IM(true);
                if (groupPollOptionsDetailBottomView.m76665rM() && groupPollOptionsDetailBottomView.m76666sM()) {
                    groupPollOptionsDetailBottomView.m76664oM();
                }
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                AbstractC19074t.m100208f(c20096c, "errorMessage");
                GroupPollOptionsDetailBottomView.this.m76652KM(false);
                GroupPollOptionsDetailBottomView.this.m76650IM(true);
                GroupPollOptionsDetailBottomView.this.m76654NM(false, c20096c.m104491c());
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                JSONArray optJSONArray;
                AbstractC19074t.m100208f(obj, "entity");
                GroupPollOptionsDetailBottomView.this.m76652KM(false);
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("answers")) != null) {
                        ArrayList arrayList = new ArrayList();
                        int length = optJSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            Object obj2 = optJSONArray.get(i11);
                            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                            arrayList.add(new C31961i8.a((JSONObject) obj2));
                        }
                        HashSet hashSet = new HashSet();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList2 = ((C31961i8.a) it.next()).f146906f;
                            if (arrayList2 != null) {
                                hashSet.addAll(arrayList2);
                            }
                        }
                        GroupPollOptionsDetailBottomView.this.m76671xM().post(new Runnable() { // from class: kb0.i

                            /* renamed from: q */
                            public final /* synthetic */ ArrayList f105043q;

                            /* renamed from: r */
                            public final /* synthetic */ HashSet f105044r;

                            /* renamed from: s */
                            public final /* synthetic */ C31961i8.a f105045s;

                            public /* synthetic */ RunnableC21653i(ArrayList arrayList3, HashSet hashSet2, C31961i8.a aVar) {
                                r2 = arrayList3;
                                r3 = hashSet2;
                                r4 = aVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                GroupPollOptionsDetailView.GroupPollOptionsDetailBottomView.C13710c.m76675d(GroupPollOptionsDetailView.GroupPollOptionsDetailBottomView.this, r2, r3, r4);
                            }
                        });
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    GroupPollOptionsDetailBottomView.this.m76654NM(false, -1);
                    GroupPollOptionsDetailBottomView.this.m76650IM(true);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.widget.poll.GroupPollOptionsDetailView$GroupPollOptionsDetailBottomView$d */
        /* loaded from: classes6.dex */
        public static final class C13711d extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C13711d f70969q = new C13711d();

            C13711d() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final ArrayList mo12V4() {
                return new ArrayList();
            }
        }

        /* renamed from: com.zing.zalo.ui.widget.poll.GroupPollOptionsDetailView$GroupPollOptionsDetailBottomView$e */
        /* loaded from: classes6.dex */
        public static final class C13712e extends AnimatorListenerAdapter {
            C13712e() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC19074t.m100208f(animator, "animation");
                super.onAnimationEnd(animator);
                GroupPollOptionsDetailBottomView.this.m76651JM(true);
                if (GroupPollOptionsDetailBottomView.this.m76666sM() && GroupPollOptionsDetailBottomView.this.m76665rM()) {
                    GroupPollOptionsDetailBottomView.this.m76664oM();
                }
            }
        }

        public GroupPollOptionsDetailBottomView() {
            InterfaceC24854k m129210a;
            m129210a = AbstractC24856m.m129210a(C13711d.f70969q);
            this.f70956U0 = m129210a;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000e, B:9:0x001f, B:12:0x002d, B:14:0x003a, B:16:0x0046, B:18:0x0049, B:21:0x004c, B:33:0x0028), top: B:2:0x0001 }] */
        /* renamed from: AM */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C31961i8.a m76633AM(Set set) {
            List arrayList;
            int size;
            int i11;
            C31961i8.a aVar;
            C31961i8.a aVar2 = null;
            try {
                GroupPollOptionsDetailView groupPollOptionsDetailView = this.f70955T0;
                if (groupPollOptionsDetailView == null) {
                    return null;
                }
                AbstractC19074t.m100205c(groupPollOptionsDetailView);
                if (groupPollOptionsDetailView.getMGroup() == null) {
                    return null;
                }
                C0943w c0943w = C0943w.f3447a;
                GroupPollOptionsDetailView groupPollOptionsDetailView2 = this.f70955T0;
                AbstractC19074t.m100205c(groupPollOptionsDetailView2);
                C32076q5 m4476k = c0943w.m4476k(groupPollOptionsDetailView2.getMGroupId());
                try {
                    if (m4476k != null) {
                        arrayList = m4476k.m154718g();
                        if (arrayList == null) {
                        }
                        ArrayList arrayList2 = new ArrayList();
                        size = arrayList.size();
                        for (i11 = 0; i11 < size; i11++) {
                            String str = (String) arrayList.get(i11);
                            if (!set.contains(str)) {
                                arrayList2.add(str);
                            }
                        }
                        aVar = new C31961i8.a(AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_option_not_yet_vote), arrayList2.size(), false);
                        aVar.f146905e = "POLL_ID_NOT_YET_VOTE";
                        aVar.f146906f = arrayList2;
                        return aVar;
                    }
                    aVar.f146905e = "POLL_ID_NOT_YET_VOTE";
                    aVar.f146906f = arrayList2;
                    return aVar;
                } catch (Exception e11) {
                    aVar2 = aVar;
                    e = e11;
                    AbstractC20110a.f98889a.mo104552e(e);
                    return aVar2;
                }
                arrayList = new ArrayList();
                ArrayList arrayList22 = new ArrayList();
                size = arrayList.size();
                while (i11 < size) {
                }
                aVar = new C31961i8.a(AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_option_not_yet_vote), arrayList22.size(), false);
            } catch (Exception e12) {
                e = e12;
            }
        }

        /* renamed from: CM */
        private final boolean m76634CM() {
            HashSet hashSet = this.f70963b1;
            if (hashSet != null) {
                AbstractC19074t.m100205c(hashSet);
                if (!hashSet.isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: FM */
        private final void m76635FM(String str) {
            if (this.f70962a1) {
                return;
            }
            this.f70961Z0 = false;
            this.f70962a1 = true;
            if (m76673zM().isEmpty()) {
                m76654NM(true, 0);
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C13710c());
            c0766k.mo1414D9(str);
        }

        /* renamed from: GM */
        private final void m76636GM(int i11) {
            try {
                GroupPollOptionsDetailRecyclerAdapter.InterfaceC6959a interfaceC6959a = null;
                if (this.f70964c1 != null) {
                    m76670wM().removeView(this.f70964c1);
                    this.f70964c1 = null;
                }
                Context context = getContext();
                C31961i8.a aVar = (C31961i8.a) m76673zM().get(i11);
                GroupPollOptionsDetailView groupPollOptionsDetailView = this.f70955T0;
                if (groupPollOptionsDetailView != null) {
                    interfaceC6959a = groupPollOptionsDetailView.getMOptionListener();
                }
                this.f70964c1 = AbstractC23184q2.m119457o(context, aVar, interfaceC6959a);
                m76670wM().addView(this.f70964c1, -1, -1);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: HM */
        public static final void m76637HM(GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView) {
            AbstractC19074t.m100208f(groupPollOptionsDetailBottomView, "this$0");
            groupPollOptionsDetailBottomView.m76647BM();
        }

        /* renamed from: MM */
        private final void m76638MM(boolean z11, int i11) {
            int i12;
            MultiStateView.EnumC15915f enumC15915f;
            try {
                if (z11) {
                    m76672yM().setVisibility(0);
                    m76672yM().setState(MultiStateView.EnumC15914e.LOADING);
                    m76670wM().setVisibility(8);
                    return;
                }
                if (i11 == 0) {
                    m76672yM().setVisibility(8);
                    m76670wM().setVisibility(0);
                    return;
                }
                m76672yM().setState(MultiStateView.EnumC15914e.ERROR);
                MultiStateView m76672yM = m76672yM();
                if (i11 == 50001) {
                    i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
                } else {
                    i12 = AbstractC8020f0.str_poll_error_loading_poll_info;
                }
                m76672yM.setErrorTitleString(AbstractC23136l9.m118743r0(i12));
                MultiStateView m76672yM2 = m76672yM();
                if (i11 == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                m76672yM2.setErrorType(enumC15915f);
                m76672yM().setVisibleErrorImage(8);
                m76672yM().setVisibility(0);
                m76670wM().setVisibility(8);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        /* renamed from: OM */
        public static final void m76639OM(GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView, boolean z11, int i11) {
            AbstractC19074t.m100208f(groupPollOptionsDetailBottomView, "this$0");
            groupPollOptionsDetailBottomView.m76638MM(z11, i11);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: kb0.h.<init>(com.zing.zalo.ui.widget.PagerSlidingTabStrip, int):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
            	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        /* renamed from: pM */
        public static final void m76645pM(com.zing.zalo.ui.widget.poll.GroupPollOptionsDetailView.GroupPollOptionsDetailBottomView r7) {
            /*
                Method dump skipped, instructions count: 334
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.ui.widget.poll.GroupPollOptionsDetailView.GroupPollOptionsDetailBottomView.m76645pM(com.zing.zalo.ui.widget.poll.GroupPollOptionsDetailView$GroupPollOptionsDetailBottomView):void");
        }

        /* renamed from: qM */
        public static final void m76646qM(PagerSlidingTabStrip pagerSlidingTabStrip, int i11) {
            AbstractC19074t.m100208f(pagerSlidingTabStrip, "$tabs");
            pagerSlidingTabStrip.setScrollOffset(i11);
        }

        /* renamed from: BM */
        public final void m76647BM() {
            GroupPollOptionsDetailView groupPollOptionsDetailView = this.f70955T0;
            if (groupPollOptionsDetailView != null) {
                m76635FM(groupPollOptionsDetailView.getMPollId());
            }
        }

        /* renamed from: DM */
        public final int m76648DM(String str) {
            if (m76673zM().size() <= 0 || TextUtils.isEmpty(str)) {
                return 0;
            }
            int size = m76673zM().size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = m76673zM().get(i11);
                AbstractC19074t.m100207e(obj, "get(...)");
                if (AbstractC19074t.m100204b(((C31961i8.a) obj).f146905e, str)) {
                    return i11;
                }
            }
            return 0;
        }

        /* renamed from: EM */
        public final ViewPager m76649EM() {
            ViewPager viewPager = this.f70959X0;
            if (viewPager != null) {
                return viewPager;
            }
            AbstractC19074t.m100223u("viewPager");
            return null;
        }

        /* renamed from: IM */
        public final void m76650IM(boolean z11) {
            this.f70961Z0 = z11;
        }

        /* renamed from: JM */
        public final void m76651JM(boolean z11) {
            this.f70966e1 = z11;
        }

        /* renamed from: KM */
        public final void m76652KM(boolean z11) {
            this.f70962a1 = z11;
        }

        /* renamed from: LM */
        public final void m76653LM(HashSet hashSet) {
            this.f70963b1 = hashSet;
        }

        /* renamed from: NM */
        public final void m76654NM(boolean z11, int i11) {
            this.f70951P0.post(new Runnable() { // from class: kb0.e

                /* renamed from: q */
                public final /* synthetic */ boolean f105036q;

                /* renamed from: r */
                public final /* synthetic */ int f105037r;

                public /* synthetic */ RunnableC21649e(boolean z112, int i112) {
                    r2 = z112;
                    r3 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupPollOptionsDetailView.GroupPollOptionsDetailBottomView.m76639OM(GroupPollOptionsDetailView.GroupPollOptionsDetailBottomView.this, r2, r3);
                }
            });
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
        /* renamed from: P2 */
        public View mo37117P2() {
            GroupPollOptionsDetailView groupPollOptionsDetailView = this.f70955T0;
            if (groupPollOptionsDetailView != null && groupPollOptionsDetailView.getMShowMode() == 0) {
                return m76670wM();
            }
            View view = this.f70964c1;
            AbstractC19074t.m100205c(view);
            return view;
        }

        /* renamed from: PM */
        public final void m76655PM(View view) {
            AbstractC19074t.m100208f(view, "<set-?>");
            this.f70952Q0 = view;
        }

        /* renamed from: QM */
        public final void m76656QM(ViewGroup viewGroup) {
            AbstractC19074t.m100208f(viewGroup, "<set-?>");
            this.f70953R0 = viewGroup;
        }

        /* renamed from: RM */
        public final void m76657RM(boolean z11) {
            this.f70957V0 = z11;
        }

        /* renamed from: S1 */
        public final void m76658S1() {
            View view;
            RecyclerView.AbstractC1880g adapter;
            try {
                GroupPollOptionsDetailView groupPollOptionsDetailView = this.f70955T0;
                if (groupPollOptionsDetailView != null && groupPollOptionsDetailView.getMShowMode() == 0) {
                    C7082h2 c7082h2 = this.f70960Y0;
                    if (c7082h2 == null) {
                        AbstractC19074t.m100223u("optionDetailAdapter");
                        c7082h2 = null;
                    }
                    for (View view2 : c7082h2.f38723u.values()) {
                        if ((view2 instanceof RecyclerView) && (adapter = ((RecyclerView) view2).getAdapter()) != null) {
                            adapter.m10008p();
                        }
                    }
                    return;
                }
                GroupPollOptionsDetailView groupPollOptionsDetailView2 = this.f70955T0;
                if (groupPollOptionsDetailView2 != null && groupPollOptionsDetailView2.getMShowMode() == 1 && (view = this.f70964c1) != null && (view instanceof RecyclerView)) {
                    AbstractC19074t.m100206d(view, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                    RecyclerView.AbstractC1880g adapter2 = ((RecyclerView) view).getAdapter();
                    if (adapter2 != null) {
                        adapter2.m10008p();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: SM */
        public final void m76659SM(MultiStateView multiStateView) {
            AbstractC19074t.m100208f(multiStateView, "<set-?>");
            this.f70954S0 = multiStateView;
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
        }

        /* renamed from: TM */
        public final void m76660TM(GroupPollOptionsDetailView groupPollOptionsDetailView) {
            this.f70955T0 = groupPollOptionsDetailView;
        }

        /* renamed from: UM */
        public final void m76661UM(ViewPager viewPager) {
            AbstractC19074t.m100208f(viewPager, "<set-?>");
            this.f70959X0 = viewPager;
        }

        /* renamed from: VM */
        public final void m76662VM() {
            this.f72454M0.setViewTranslationY(mo37127dM());
            m76638MM(true, 0);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f70965d1 = animatorSet;
            AbstractC19074t.m100205c(animatorSet);
            animatorSet.play(ObjectAnimator.ofFloat(this.f72454M0, "translationY", mo37128eM()));
            AnimatorSet animatorSet2 = this.f70965d1;
            AbstractC19074t.m100205c(animatorSet2);
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.f70965d1;
            AbstractC19074t.m100205c(animatorSet3);
            animatorSet3.setInterpolator(new C26088c());
            AnimatorSet animatorSet4 = this.f70965d1;
            AbstractC19074t.m100205c(animatorSet4);
            animatorSet4.start();
            AnimatorSet animatorSet5 = this.f70965d1;
            AbstractC19074t.m100205c(animatorSet5);
            animatorSet5.addListener(new C13712e());
        }

        public final void close() {
            AnimatorSet animatorSet = this.f70965d1;
            if (animatorSet != null) {
                AbstractC19074t.m100205c(animatorSet);
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f72454M0, "translationY", mo37127dM()));
            animatorSet2.setDuration(250L);
            animatorSet2.setInterpolator(new C26086a());
            animatorSet2.start();
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
        /* renamed from: eM */
        public int mo37128eM() {
            int i11 = f70950f1;
            if (i11 >= mo37127dM()) {
                return 0;
            }
            return mo37127dM() - i11;
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
        /* renamed from: fM */
        protected void mo37129fM(LinearLayout linearLayout) {
            AbstractC19074t.m100208f(linearLayout, "llContainer");
            View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.group_poll_detail_bottom_view, (ViewGroup) linearLayout, true);
            AbstractC19074t.m100207e(inflate, "inflate(...)");
            m76655PM(inflate);
            this.f72456O0.setVisibility(0);
            View findViewById = m76669vM().findViewById(AbstractC6918a0.container_content);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            m76656QM((ViewGroup) findViewById);
            View findViewById2 = m76669vM().findViewById(AbstractC6918a0.multi_state);
            AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
            m76659SM((MultiStateView) findViewById2);
            ViewGroup.LayoutParams layoutParams = m76672yM().getLayoutParams();
            int i11 = f70950f1;
            if (i11 > AbstractC23136l9.m118713h0()) {
                i11 = AbstractC23136l9.m118713h0();
            }
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, i11);
            } else {
                layoutParams.height = i11;
            }
            m76672yM().setLayoutParams(layoutParams);
            m76672yM().setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: kb0.f
                public /* synthetic */ C21650f() {
                }

                @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                /* renamed from: a */
                public final void mo12138a() {
                    GroupPollOptionsDetailView.GroupPollOptionsDetailBottomView.m76637HM(GroupPollOptionsDetailView.GroupPollOptionsDetailBottomView.this);
                }
            });
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
        /* renamed from: gM */
        public void mo37132gM() {
            InterfaceC13714b mListener;
            super.mo37132gM();
            GroupPollOptionsDetailView groupPollOptionsDetailView = this.f70955T0;
            if (groupPollOptionsDetailView != null && (mListener = groupPollOptionsDetailView.getMListener()) != null) {
                mListener.mo76677a();
            }
            this.f72454M0.setEnableScrollY(false);
        }

        @Override // ac.InterfaceC0733x
        public String getTrackingKey() {
            return "GroupPollOptionsDetailBottomView";
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:            if (r5.m153742T() != false) goto L53;     */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:            if (r5.m153742T() != false) goto L63;     */
        /* renamed from: nM */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m76663nM(int i11) {
            if (this.f70955T0 != null) {
                Object obj = m76673zM().get(i11);
                AbstractC19074t.m100207e(obj, "get(...)");
                C31961i8.a aVar = (C31961i8.a) obj;
                GroupPollOptionsDetailView groupPollOptionsDetailView = this.f70955T0;
                AbstractC19074t.m100205c(groupPollOptionsDetailView);
                groupPollOptionsDetailView.setMPollOptionId(aVar.f146905e);
                if (AbstractC19074t.m100204b(aVar.f146905e, "POLL_ID_NOT_YET_VOTE")) {
                    GroupPollOptionsDetailView groupPollOptionsDetailView2 = this.f70955T0;
                    AbstractC19074t.m100205c(groupPollOptionsDetailView2);
                    groupPollOptionsDetailView2.setBtnDoneMode(1);
                    if (aVar.f146906f.size() > 0 && (aVar.f146906f.size() != 1 || !AbstractC19074t.m100204b(aVar.f146906f.get(0), CoreUtility.f89233i))) {
                        GroupPollOptionsDetailView groupPollOptionsDetailView3 = this.f70955T0;
                        AbstractC19074t.m100205c(groupPollOptionsDetailView3);
                        if (!AbstractC19074t.m100204b(groupPollOptionsDetailView3.getMCreatorId(), CoreUtility.f89233i)) {
                            GroupPollOptionsDetailView groupPollOptionsDetailView4 = this.f70955T0;
                            AbstractC19074t.m100205c(groupPollOptionsDetailView4);
                            C31973j5 mGroup = groupPollOptionsDetailView4.getMGroup();
                            AbstractC19074t.m100205c(mGroup);
                        }
                        GroupPollOptionsDetailView groupPollOptionsDetailView5 = this.f70955T0;
                        AbstractC19074t.m100205c(groupPollOptionsDetailView5);
                        if (groupPollOptionsDetailView5.getMGroup() != null && AbstractC23309i.m121590X2()) {
                            GroupPollOptionsDetailView groupPollOptionsDetailView6 = this.f70955T0;
                            AbstractC19074t.m100205c(groupPollOptionsDetailView6);
                            C31973j5 mGroup2 = groupPollOptionsDetailView6.getMGroup();
                            AbstractC19074t.m100205c(mGroup2);
                            if (mGroup2.m153792x() != 1) {
                                GroupPollOptionsDetailView groupPollOptionsDetailView7 = this.f70955T0;
                                AbstractC19074t.m100205c(groupPollOptionsDetailView7);
                                C31973j5 mGroup3 = groupPollOptionsDetailView7.getMGroup();
                                AbstractC19074t.m100205c(mGroup3);
                                if (mGroup3.m153792x() == 2) {
                                    GroupPollOptionsDetailView groupPollOptionsDetailView8 = this.f70955T0;
                                    AbstractC19074t.m100205c(groupPollOptionsDetailView8);
                                    C31973j5 mGroup4 = groupPollOptionsDetailView8.getMGroup();
                                    AbstractC19074t.m100205c(mGroup4);
                                }
                            }
                            GroupPollOptionsDetailView groupPollOptionsDetailView9 = this.f70955T0;
                            AbstractC19074t.m100205c(groupPollOptionsDetailView9);
                            groupPollOptionsDetailView9.getMLayoutBtnDone().setVisibility(0);
                            GroupPollOptionsDetailView groupPollOptionsDetailView10 = this.f70955T0;
                            AbstractC19074t.m100205c(groupPollOptionsDetailView10);
                            groupPollOptionsDetailView10.getMBtnDone().setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_remind_vote_poll_btn));
                            return;
                        }
                    }
                    GroupPollOptionsDetailView groupPollOptionsDetailView11 = this.f70955T0;
                    AbstractC19074t.m100205c(groupPollOptionsDetailView11);
                    groupPollOptionsDetailView11.getMLayoutBtnDone().setVisibility(8);
                    return;
                }
                GroupPollOptionsDetailView groupPollOptionsDetailView12 = this.f70955T0;
                AbstractC19074t.m100205c(groupPollOptionsDetailView12);
                groupPollOptionsDetailView12.setBtnDoneMode(0);
                if (this.f70958W0) {
                    GroupPollOptionsDetailView groupPollOptionsDetailView13 = this.f70955T0;
                    AbstractC19074t.m100205c(groupPollOptionsDetailView13);
                    groupPollOptionsDetailView13.getMLayoutBtnDone().setVisibility(0);
                    GroupPollOptionsDetailView groupPollOptionsDetailView14 = this.f70955T0;
                    AbstractC19074t.m100205c(groupPollOptionsDetailView14);
                    groupPollOptionsDetailView14.getMBtnDone().setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_createGroup));
                    return;
                }
                GroupPollOptionsDetailView groupPollOptionsDetailView15 = this.f70955T0;
                AbstractC19074t.m100205c(groupPollOptionsDetailView15);
                groupPollOptionsDetailView15.getMLayoutBtnDone().setVisibility(8);
            }
        }

        /* renamed from: oM */
        public final void m76664oM() {
            this.f70951P0.post(new Runnable() { // from class: kb0.g
                public /* synthetic */ RunnableC21651g() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GroupPollOptionsDetailView.GroupPollOptionsDetailBottomView.m76645pM(GroupPollOptionsDetailView.GroupPollOptionsDetailBottomView.this);
                }
            });
        }

        /* renamed from: rM */
        public final boolean m76665rM() {
            return this.f70961Z0;
        }

        /* renamed from: sM */
        public final boolean m76666sM() {
            return this.f70966e1;
        }

        /* renamed from: tM */
        public final int m76667tM() {
            return m76649EM().getCurrentItem();
        }

        /* renamed from: uM */
        public final HashSet m76668uM() {
            return this.f70963b1;
        }

        /* renamed from: vM */
        public final View m76669vM() {
            View view = this.f70952Q0;
            if (view != null) {
                return view;
            }
            AbstractC19074t.m100223u("mContainer");
            return null;
        }

        /* renamed from: wM */
        public final ViewGroup m76670wM() {
            ViewGroup viewGroup = this.f70953R0;
            if (viewGroup != null) {
                return viewGroup;
            }
            AbstractC19074t.m100223u("mContentContainer");
            return null;
        }

        @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
        /* renamed from: x3 */
        public void mo72543x3() {
            GroupPollOptionsDetailView groupPollOptionsDetailView = this.f70955T0;
            if (groupPollOptionsDetailView != null) {
                groupPollOptionsDetailView.m76628f();
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
        /* renamed from: xJ */
        public void mo37135xJ(Bundle bundle) {
            super.mo37135xJ(bundle);
            m76647BM();
        }

        /* renamed from: xM */
        public final Handler m76671xM() {
            return this.f70951P0;
        }

        /* renamed from: yM */
        public final MultiStateView m76672yM() {
            MultiStateView multiStateView = this.f70954S0;
            if (multiStateView != null) {
                return multiStateView;
            }
            AbstractC19074t.m100223u("mMultiStateView");
            return null;
        }

        /* renamed from: zM */
        public final ArrayList m76673zM() {
            return (ArrayList) this.f70956U0.getValue();
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.poll.GroupPollOptionsDetailView$a */
    /* loaded from: classes6.dex */
    public static final class C13713a {
        private C13713a() {
        }

        public /* synthetic */ C13713a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.poll.GroupPollOptionsDetailView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13714b {
        /* renamed from: a */
        void mo76677a();

        /* renamed from: b */
        void mo76678b();
    }

    /* renamed from: com.zing.zalo.ui.widget.poll.GroupPollOptionsDetailView$c */
    /* loaded from: classes6.dex */
    public static final class C13715c extends AnimatorListenerAdapter {
        C13715c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            GroupPollOptionsDetailView.this.setMIsClosing(false);
            GroupPollOptionsDetailView.this.setVisibility(8);
            InterfaceC13714b mListener = GroupPollOptionsDetailView.this.getMListener();
            if (mListener != null) {
                mListener.mo76678b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            GroupPollOptionsDetailView.this.setMIsClosing(false);
            GroupPollOptionsDetailView.this.setVisibility(8);
            InterfaceC13714b mListener = GroupPollOptionsDetailView.this.getMListener();
            if (mListener != null) {
                mListener.mo76678b();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupPollOptionsDetailView(Context context, ZaloView zaloView, String str, String str2, String str3, String str4, GroupPollOptionsDetailRecyclerAdapter.InterfaceC6959a interfaceC6959a, InterfaceC13714b interfaceC13714b) {
        super(context);
        AbstractC19074t.m100208f(context, "mContext");
        AbstractC19074t.m100208f(zaloView, "mParentView");
        AbstractC19074t.m100208f(str, "mPollId");
        AbstractC19074t.m100208f(str2, "mPollQuestion");
        AbstractC19074t.m100208f(str3, "mGroupId");
        AbstractC19074t.m100208f(str4, "creatorId");
        AbstractC19074t.m100208f(interfaceC6959a, "optionListener");
        this.f70939p = context;
        this.f70940q = zaloView;
        this.f70941r = str;
        this.f70942s = str2;
        this.f70943t = str3;
        this.f70932A = C0943w.f3447a.m4472f(str3);
        this.f70933B = str4;
        this.f70935D = interfaceC6959a;
        this.f70936E = interfaceC13714b;
        m76631k();
    }

    /* renamed from: g */
    private final JSONObject m76621g() {
        int m76648DM;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f70934C == 0) {
                GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView = this.f70944u;
                if (groupPollOptionsDetailBottomView == null) {
                    AbstractC19074t.m100223u("mDetailBtmView");
                    groupPollOptionsDetailBottomView = null;
                }
                m76648DM = groupPollOptionsDetailBottomView.m76667tM();
            } else {
                GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView2 = this.f70944u;
                if (groupPollOptionsDetailBottomView2 == null) {
                    AbstractC19074t.m100223u("mDetailBtmView");
                    groupPollOptionsDetailBottomView2 = null;
                }
                m76648DM = groupPollOptionsDetailBottomView2.m76648DM(this.f70938G);
            }
            JSONArray jSONArray = new JSONArray();
            GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView3 = this.f70944u;
            if (groupPollOptionsDetailBottomView3 == null) {
                AbstractC19074t.m100223u("mDetailBtmView");
                groupPollOptionsDetailBottomView3 = null;
            }
            ArrayList arrayList = ((C31961i8.a) groupPollOptionsDetailBottomView3.m76673zM().get(m76648DM)).f146906f;
            AbstractC19074t.m100207e(arrayList, "usersVote");
            GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView4 = this.f70944u;
            if (groupPollOptionsDetailBottomView4 == null) {
                AbstractC19074t.m100223u("mDetailBtmView");
                groupPollOptionsDetailBottomView4 = null;
            }
            jSONArray.put(m76622h(arrayList, ((C31961i8.a) groupPollOptionsDetailBottomView4.m76673zM().get(m76648DM)).f146901a, true));
            GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView5 = this.f70944u;
            if (groupPollOptionsDetailBottomView5 == null) {
                AbstractC19074t.m100223u("mDetailBtmView");
                groupPollOptionsDetailBottomView5 = null;
            }
            int size = groupPollOptionsDetailBottomView5.m76673zM().size();
            for (int i11 = 0; i11 < size; i11++) {
                if (i11 != m76648DM) {
                    GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView6 = this.f70944u;
                    if (groupPollOptionsDetailBottomView6 == null) {
                        AbstractC19074t.m100223u("mDetailBtmView");
                        groupPollOptionsDetailBottomView6 = null;
                    }
                    if (!AbstractC19074t.m100204b(((C31961i8.a) groupPollOptionsDetailBottomView6.m76673zM().get(i11)).f146905e, "POLL_ID_NOT_YET_VOTE")) {
                        GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView7 = this.f70944u;
                        if (groupPollOptionsDetailBottomView7 == null) {
                            AbstractC19074t.m100223u("mDetailBtmView");
                            groupPollOptionsDetailBottomView7 = null;
                        }
                        ArrayList arrayList2 = ((C31961i8.a) groupPollOptionsDetailBottomView7.m76673zM().get(i11)).f146906f;
                        AbstractC19074t.m100207e(arrayList2, "usersVote");
                        GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView8 = this.f70944u;
                        if (groupPollOptionsDetailBottomView8 == null) {
                            AbstractC19074t.m100223u("mDetailBtmView");
                            groupPollOptionsDetailBottomView8 = null;
                        }
                        jSONArray.put(m76622h(arrayList2, ((C31961i8.a) groupPollOptionsDetailBottomView8.m76673zM().get(i11)).f146901a, false));
                    }
                }
            }
            jSONObject.put("listSectionSuggest", jSONArray);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("scrollTop", 1);
            jSONObject2.put("selectTabType", 0);
            jSONObject2.put("actionTitle", AbstractC23136l9.m118743r0(AbstractC8020f0.str_new_group_title_select_member));
            jSONObject.put("initConfig", jSONObject2);
            jSONObject.put("pollQuestion", this.f70942s);
            jSONObject.put("groupId", this.f70943t);
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject;
    }

    /* renamed from: h */
    private final JSONObject m76622h(ArrayList arrayList, String str, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", arrayList.get(i11));
                jSONObject2.put("dName", "");
                jSONObject2.put("avatar", "");
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("listMember", jSONArray);
            jSONObject.put("autoSelect", z11);
            jSONObject.put("sectionTitle", str);
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject;
    }

    /* renamed from: l */
    public static final void m76623l(GroupPollOptionsDetailView groupPollOptionsDetailView, View view) {
        AbstractC19074t.m100208f(groupPollOptionsDetailView, "this$0");
        if (!groupPollOptionsDetailView.f70949z) {
            groupPollOptionsDetailView.f70949z = true;
            groupPollOptionsDetailView.m76628f();
        }
    }

    /* renamed from: m */
    public static final void m76624m(GroupPollOptionsDetailView groupPollOptionsDetailView, View view) {
        AbstractC19074t.m100208f(groupPollOptionsDetailView, "this$0");
        int i11 = groupPollOptionsDetailView.f70948y;
        if (i11 == 1) {
            GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView = groupPollOptionsDetailView.f70944u;
            if (groupPollOptionsDetailBottomView == null) {
                AbstractC19074t.m100223u("mDetailBtmView");
                groupPollOptionsDetailBottomView = null;
            }
            ArrayList m76673zM = groupPollOptionsDetailBottomView.m76673zM();
            GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView2 = groupPollOptionsDetailView.f70944u;
            if (groupPollOptionsDetailBottomView2 == null) {
                AbstractC19074t.m100223u("mDetailBtmView");
                groupPollOptionsDetailBottomView2 = null;
            }
            Object obj = m76673zM.get(groupPollOptionsDetailBottomView2.m76648DM(groupPollOptionsDetailView.f70938G));
            AbstractC19074t.m100207e(obj, "get(...)");
            C31961i8.a aVar = (C31961i8.a) obj;
            ArrayList arrayList = aVar.f146906f;
            if (arrayList != null && arrayList.size() <= 5) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = aVar.f146906f.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
                    if (m141798e != null) {
                        if (!AbstractC19074t.m100204b(m141798e.f42434r, CoreUtility.f89233i)) {
                            arrayList2.add(m141798e);
                        }
                    } else {
                        arrayList3.add(str);
                    }
                }
                if (arrayList3.size() > 0) {
                    AbstractC23184q2.m119463u(arrayList3, new Runnable() { // from class: kb0.c

                        /* renamed from: p */
                        public final /* synthetic */ ArrayList f105029p;

                        /* renamed from: q */
                        public final /* synthetic */ ArrayList f105030q;

                        /* renamed from: r */
                        public final /* synthetic */ GroupPollOptionsDetailView f105031r;

                        public /* synthetic */ RunnableC21647c(ArrayList arrayList32, ArrayList arrayList22, GroupPollOptionsDetailView groupPollOptionsDetailView2) {
                            r1 = arrayList32;
                            r2 = arrayList22;
                            r3 = groupPollOptionsDetailView2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupPollOptionsDetailView.m76625n(r1, r2, r3);
                        }
                    });
                    return;
                }
                ZaloView zaloView = groupPollOptionsDetailView2.f70940q;
                AbstractC19074t.m100206d(zaloView, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.GroupPollVotingView");
                ((GroupPollVotingView) zaloView).m80418SN(groupPollOptionsDetailView2.f70941r);
                AbstractC23184q2.m119449g(1, groupPollOptionsDetailView2.f70943t, 0, arrayList22);
                AbstractC23211s7.m119575h(groupPollOptionsDetailView2.f70943t, groupPollOptionsDetailView2.f70940q.m92676n2(), true);
                return;
            }
            ZaloView zaloView2 = groupPollOptionsDetailView2.f70940q;
            AbstractC19074t.m100206d(zaloView2, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.GroupPollVotingView");
            ((GroupPollVotingView) zaloView2).m80418SN(groupPollOptionsDetailView2.f70941r);
            AbstractC23184q2.m119449g(1, groupPollOptionsDetailView2.f70943t, 1, null);
            AbstractC23211s7.m119575h(groupPollOptionsDetailView2.f70943t, groupPollOptionsDetailView2.f70940q.m92676n2(), true);
            return;
        }
        if (i11 == 0) {
            ZaloView zaloView3 = groupPollOptionsDetailView2.f70940q;
            AbstractC19074t.m100206d(zaloView3, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.GroupPollVotingView");
            ((GroupPollVotingView) zaloView3).mo46829Y();
            ZaloView zaloView4 = groupPollOptionsDetailView2.f70940q;
            AbstractC19074t.m100206d(zaloView4, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.GroupPollVotingView");
            ((GroupPollVotingView) zaloView4).m80421gO(true);
            AbstractC23647d.m123897g("300802");
            Bundle bundle = new Bundle();
            JSONObject m76621g = groupPollOptionsDetailView2.m76621g();
            ArrayList arrayList4 = new ArrayList();
            GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView3 = groupPollOptionsDetailView2.f70944u;
            if (groupPollOptionsDetailBottomView3 == null) {
                AbstractC19074t.m100223u("mDetailBtmView");
                groupPollOptionsDetailBottomView3 = null;
            }
            int size = groupPollOptionsDetailBottomView3.m76673zM().size();
            for (int i12 = 0; i12 < size; i12++) {
                GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView4 = groupPollOptionsDetailView2.f70944u;
                if (groupPollOptionsDetailBottomView4 == null) {
                    AbstractC19074t.m100223u("mDetailBtmView");
                    groupPollOptionsDetailBottomView4 = null;
                }
                if (!AbstractC19074t.m100204b(((C31961i8.a) groupPollOptionsDetailBottomView4.m76673zM().get(i12)).f146905e, "POLL_ID_NOT_YET_VOTE")) {
                    GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView5 = groupPollOptionsDetailView2.f70944u;
                    if (groupPollOptionsDetailBottomView5 == null) {
                        AbstractC19074t.m100223u("mDetailBtmView");
                        groupPollOptionsDetailBottomView5 = null;
                    }
                    int size2 = ((C31961i8.a) groupPollOptionsDetailBottomView5.m76673zM().get(i12)).f146906f.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView6 = groupPollOptionsDetailView2.f70944u;
                        if (groupPollOptionsDetailBottomView6 == null) {
                            AbstractC19074t.m100223u("mDetailBtmView");
                            groupPollOptionsDetailBottomView6 = null;
                        }
                        String str2 = (String) ((C31961i8.a) groupPollOptionsDetailBottomView6.m76673zM().get(i12)).f146906f.get(i13);
                        if (C28203u6.m141798e(C28203u6.f131407a, str2, null, 2, null) == null) {
                            arrayList4.add(str2);
                        }
                    }
                }
            }
            if (arrayList4.size() > 0) {
                AbstractC23184q2.m119463u(arrayList4, new Runnable() { // from class: kb0.d

                    /* renamed from: q */
                    public final /* synthetic */ Bundle f105033q;

                    /* renamed from: r */
                    public final /* synthetic */ JSONObject f105034r;

                    public /* synthetic */ RunnableC21648d(Bundle bundle2, JSONObject m76621g2) {
                        r2 = bundle2;
                        r3 = m76621g2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupPollOptionsDetailView.m76626p(GroupPollOptionsDetailView.this, r2, r3);
                    }
                });
                return;
            }
            ZaloView zaloView5 = groupPollOptionsDetailView2.f70940q;
            AbstractC19074t.m100206d(zaloView5, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.GroupPollVotingView");
            if (!((GroupPollVotingView) zaloView5).m80427xN()) {
                return;
            }
            bundle2.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 10);
            bundle2.putString("extra_preload_data", m76621g2.toString());
            bundle2.putString("extra_group_id", groupPollOptionsDetailView2.f70943t);
            C17487o0 m92662fJ = groupPollOptionsDetailView2.f70940q.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(QuickCreateGroupView.class, bundle2, 1, true);
            }
            ZaloView zaloView6 = groupPollOptionsDetailView2.f70940q;
            AbstractC19074t.m100206d(zaloView6, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.GroupPollVotingView");
            ((GroupPollVotingView) zaloView6).mo49315c4();
        }
    }

    /* renamed from: n */
    public static final void m76625n(ArrayList arrayList, ArrayList arrayList2, GroupPollOptionsDetailView groupPollOptionsDetailView) {
        AbstractC19074t.m100208f(arrayList, "$unknownUids");
        AbstractC19074t.m100208f(arrayList2, "$listProfiles");
        AbstractC19074t.m100208f(groupPollOptionsDetailView, "this$0");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, (String) it.next(), null, 2, null);
            if (m141798e != null && !AbstractC19074t.m100204b(m141798e.f42434r, CoreUtility.f89233i)) {
                arrayList2.add(m141798e);
            }
        }
        ZaloView zaloView = groupPollOptionsDetailView.f70940q;
        AbstractC19074t.m100206d(zaloView, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.GroupPollVotingView");
        ((GroupPollVotingView) zaloView).m80418SN(groupPollOptionsDetailView.f70941r);
        AbstractC23184q2.m119449g(1, groupPollOptionsDetailView.f70943t, 0, arrayList2);
        AbstractC23211s7.m119575h(groupPollOptionsDetailView.f70943t, groupPollOptionsDetailView.f70940q.m92676n2(), true);
    }

    /* renamed from: p */
    public static final void m76626p(GroupPollOptionsDetailView groupPollOptionsDetailView, Bundle bundle, JSONObject jSONObject) {
        AbstractC19074t.m100208f(groupPollOptionsDetailView, "this$0");
        AbstractC19074t.m100208f(bundle, "$bundle");
        AbstractC19074t.m100208f(jSONObject, "$dataPreload");
        ZaloView zaloView = groupPollOptionsDetailView.f70940q;
        AbstractC19074t.m100206d(zaloView, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.GroupPollVotingView");
        if (!((GroupPollVotingView) zaloView).m80427xN()) {
            return;
        }
        bundle.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 10);
        bundle.putString("extra_preload_data", jSONObject.toString());
        bundle.putString("extra_group_id", groupPollOptionsDetailView.f70943t);
        C17487o0 m92662fJ = groupPollOptionsDetailView.f70940q.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(QuickCreateGroupView.class, bundle, 1, true);
        }
        ZaloView zaloView2 = groupPollOptionsDetailView.f70940q;
        AbstractC19074t.m100206d(zaloView2, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.GroupPollVotingView");
        ((GroupPollVotingView) zaloView2).mo49315c4();
    }

    /* renamed from: e */
    public final boolean m76627e() {
        GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView = this.f70944u;
        GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView2 = null;
        if (groupPollOptionsDetailBottomView == null) {
            AbstractC19074t.m100223u("mDetailBtmView");
            groupPollOptionsDetailBottomView = null;
        }
        if (groupPollOptionsDetailBottomView.m76668uM() == null) {
            return false;
        }
        boolean m121891f3 = AbstractC23309i.m121891f3();
        int m122636z0 = AbstractC23309i.m122636z0();
        GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView3 = this.f70944u;
        if (groupPollOptionsDetailBottomView3 == null) {
            AbstractC19074t.m100223u("mDetailBtmView");
            groupPollOptionsDetailBottomView3 = null;
        }
        HashSet m76668uM = groupPollOptionsDetailBottomView3.m76668uM();
        AbstractC19074t.m100205c(m76668uM);
        int size = m76668uM.size();
        GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView4 = this.f70944u;
        if (groupPollOptionsDetailBottomView4 == null) {
            AbstractC19074t.m100223u("mDetailBtmView");
        } else {
            groupPollOptionsDetailBottomView2 = groupPollOptionsDetailBottomView4;
        }
        HashSet m76668uM2 = groupPollOptionsDetailBottomView2.m76668uM();
        AbstractC19074t.m100205c(m76668uM2);
        if (m76668uM2.contains(CoreUtility.f89233i)) {
            size--;
        }
        if (!m121891f3 || size < 2 || size > m122636z0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void m76628f() {
        GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView = this.f70944u;
        if (groupPollOptionsDetailBottomView == null) {
            AbstractC19074t.m100223u("mDetailBtmView");
            groupPollOptionsDetailBottomView = null;
        }
        groupPollOptionsDetailBottomView.close();
        AnimatorSet animatorSet = this.f70937F;
        if (animatorSet != null) {
            AbstractC19074t.m100205c(animatorSet);
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ObjectAnimator.ofFloat(this, "alpha", 0.0f));
        animatorSet2.setDuration(250L);
        animatorSet2.setInterpolator(new C26086a());
        animatorSet2.addListener(new C13715c());
        animatorSet2.start();
    }

    public final int getBtnDoneMode() {
        return this.f70948y;
    }

    public final RobotoTextView getMBtnDone() {
        RobotoTextView robotoTextView = this.f70947x;
        if (robotoTextView != null) {
            return robotoTextView;
        }
        AbstractC19074t.m100223u("mBtnDone");
        return null;
    }

    public final Context getMContext() {
        return this.f70939p;
    }

    public final String getMCreatorId() {
        return this.f70933B;
    }

    public final C31973j5 getMGroup() {
        return this.f70932A;
    }

    public final String getMGroupId() {
        return this.f70943t;
    }

    public final boolean getMIsClosing() {
        return this.f70949z;
    }

    public final View getMLayoutBtnDone() {
        View view = this.f70946w;
        if (view != null) {
            return view;
        }
        AbstractC19074t.m100223u("mLayoutBtnDone");
        return null;
    }

    public final InterfaceC13714b getMListener() {
        return this.f70936E;
    }

    public final GroupPollOptionsDetailRecyclerAdapter.InterfaceC6959a getMOptionListener() {
        return this.f70935D;
    }

    public final ZaloView getMParentView() {
        return this.f70940q;
    }

    public final String getMPollId() {
        return this.f70941r;
    }

    public final String getMPollOptionId() {
        return this.f70938G;
    }

    public final View getMRootView() {
        View view = this.f70945v;
        if (view != null) {
            return view;
        }
        AbstractC19074t.m100223u("mRootView");
        return null;
    }

    public final int getMShowMode() {
        return this.f70934C;
    }

    /* renamed from: i */
    public final void m76629i() {
        GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView = this.f70944u;
        if (groupPollOptionsDetailBottomView == null) {
            AbstractC19074t.m100223u("mDetailBtmView");
            groupPollOptionsDetailBottomView = null;
        }
        groupPollOptionsDetailBottomView.m76647BM();
    }

    /* renamed from: j */
    public final void m76630j() {
        GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView = this.f70944u;
        if (groupPollOptionsDetailBottomView == null) {
            AbstractC19074t.m100223u("mDetailBtmView");
            groupPollOptionsDetailBottomView = null;
        }
        groupPollOptionsDetailBottomView.m76658S1();
    }

    /* renamed from: k */
    public final void m76631k() {
        GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView;
        setBackgroundColor(-1728053248);
        View inflate = LayoutInflater.from(this.f70939p).inflate(AbstractC7409c0.group_poll_detail_view, (ViewGroup) this, true);
        AbstractC19074t.m100207e(inflate, "inflate(...)");
        setMRootView(inflate);
        ZaloView m92993D0 = this.f70940q.m92649TI().m92993D0(GroupPollOptionsDetailBottomView.class);
        if (m92993D0 != null) {
            m92993D0.finish();
        }
        this.f70944u = new GroupPollOptionsDetailBottomView();
        C17487o0 m92649TI = this.f70940q.m92649TI();
        int i11 = AbstractC6918a0.fl_bottom_container;
        GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView2 = this.f70944u;
        if (groupPollOptionsDetailBottomView2 == null) {
            AbstractC19074t.m100223u("mDetailBtmView");
            groupPollOptionsDetailBottomView = null;
        } else {
            groupPollOptionsDetailBottomView = groupPollOptionsDetailBottomView2;
        }
        m92649TI.m93058d2(i11, groupPollOptionsDetailBottomView, 0, "GroupPollOptionsDetailBottomView", 0, false);
        GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView3 = this.f70944u;
        if (groupPollOptionsDetailBottomView3 == null) {
            AbstractC19074t.m100223u("mDetailBtmView");
            groupPollOptionsDetailBottomView3 = null;
        }
        groupPollOptionsDetailBottomView3.m76660TM(this);
        setOnClickListener(new View.OnClickListener() { // from class: kb0.a
            public /* synthetic */ ViewOnClickListenerC21645a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupPollOptionsDetailView.m76623l(GroupPollOptionsDetailView.this, view);
            }
        });
        View findViewById = getMRootView().findViewById(AbstractC6918a0.layout_btn_done);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        setMLayoutBtnDone(findViewById);
        getMLayoutBtnDone().setOnClickListener(null);
        View findViewById2 = getMRootView().findViewById(AbstractC6918a0.btn_done);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        setMBtnDone((RobotoTextView) findViewById2);
        getMBtnDone().setOnClickListener(new View.OnClickListener() { // from class: kb0.b
            public /* synthetic */ ViewOnClickListenerC21646b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupPollOptionsDetailView.m76624m(GroupPollOptionsDetailView.this, view);
            }
        });
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        AbstractC19074t.m100208f(motionEvent, "ev");
        if (motionEvent.getAction() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        requestDisallowInterceptTouchEvent(z11);
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: q */
    public final void m76632q(int i11, String str) {
        this.f70934C = i11;
        this.f70938G = str;
        setAlpha(0.0f);
        setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f70937F = animatorSet;
        AbstractC19074t.m100205c(animatorSet);
        animatorSet.play(ObjectAnimator.ofFloat(this, "alpha", 1.0f));
        AnimatorSet animatorSet2 = this.f70937F;
        AbstractC19074t.m100205c(animatorSet2);
        animatorSet2.setDuration(250L);
        AnimatorSet animatorSet3 = this.f70937F;
        AbstractC19074t.m100205c(animatorSet3);
        animatorSet3.setInterpolator(new C26088c());
        AnimatorSet animatorSet4 = this.f70937F;
        AbstractC19074t.m100205c(animatorSet4);
        animatorSet4.start();
        GroupPollOptionsDetailBottomView groupPollOptionsDetailBottomView = this.f70944u;
        if (groupPollOptionsDetailBottomView == null) {
            AbstractC19074t.m100223u("mDetailBtmView");
            groupPollOptionsDetailBottomView = null;
        }
        groupPollOptionsDetailBottomView.m76662VM();
    }

    public final void setBtnDoneMode(int i11) {
        this.f70948y = i11;
    }

    public final void setMBtnDone(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f70947x = robotoTextView;
    }

    public final void setMIsClosing(boolean z11) {
        this.f70949z = z11;
    }

    public final void setMLayoutBtnDone(View view) {
        AbstractC19074t.m100208f(view, "<set-?>");
        this.f70946w = view;
    }

    public final void setMParentView(ZaloView zaloView) {
        AbstractC19074t.m100208f(zaloView, "<set-?>");
        this.f70940q = zaloView;
    }

    public final void setMPollOptionId(String str) {
        this.f70938G = str;
    }

    public final void setMRootView(View view) {
        AbstractC19074t.m100208f(view, "<set-?>");
        this.f70945v = view;
    }

    public final void setMShowMode(int i11) {
        this.f70934C = i11;
    }
}
