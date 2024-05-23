package z10;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.SimilarChannel;
import com.zing.zalo.shortvideo.p072ui.widget.SimilarChannelLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mj0.AbstractC23322a;
import q10.C25036n0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import u20.C26980a;
import v00.AbstractC27406a;
import v00.AbstractC27408c;
import v00.AbstractC27409d;
import v00.AbstractC27411f;
import v00.AbstractC27413h;

/* renamed from: z10.l0 */
/* loaded from: classes5.dex */
public final class C31175l0 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private List f143867r;

    /* renamed from: s */
    private InterfaceC18510q f143868s;

    /* renamed from: t */
    private InterfaceC18505l f143869t;

    /* renamed from: z10.l0$a */
    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final C25036n0 f143870I;

        /* renamed from: J */
        private SimilarChannel f143871J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C25036n0 c25036n0) {
            super(c25036n0.getRoot());
            AbstractC19074t.m100208f(c25036n0, "bind");
            this.f143870I = c25036n0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0038, code lost:            r0 = on0.AbstractC24340u.m127109o(r0);     */
        /* renamed from: i0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m151782i0(SimilarChannel similarChannel, View.OnClickListener onClickListener) {
            long j11;
            Long m127109o;
            AbstractC19074t.m100208f(similarChannel, "similar");
            AbstractC19074t.m100208f(onClickListener, "onClickListener");
            AvatarImageView avatarImageView = this.f143870I.f120126q;
            AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
            AvatarImageView.m55927l(avatarImageView, similarChannel.m51202c(), similarChannel.m51204e(), similarChannel.m51201b(), 0, false, 24, null);
            this.f143870I.f120130u.setText(similarChannel.m51204e());
            String m51203d = similarChannel.m51203d();
            if (m51203d != null && m127109o != null) {
                j11 = m127109o.longValue();
            } else {
                j11 = 0;
            }
            SimpleShadowTextView simpleShadowTextView = this.f143870I.f120129t;
            View view = this.f7784p;
            AbstractC19074t.m100207e(view, "itemView");
            int i11 = AbstractC27411f.zch_page_search_item_similar_channel_stats_follower;
            long j12 = 1;
            if (j11 > 1) {
                j12 = j11;
            }
            simpleShadowTextView.setText(AbstractC26112n.m134363D(view, i11, j12, AbstractC26105g.m134334a(j11)));
            if (AbstractC19074t.m100204b(similarChannel.m51205f(), Boolean.FALSE)) {
                m151784k0(onClickListener);
            } else if (AbstractC19074t.m100204b(similarChannel.m51205f(), Boolean.TRUE)) {
                m151785l0(onClickListener);
            }
            SimilarChannelLayout similarChannelLayout = this.f143870I.f120128s;
            AbstractC19074t.m100207e(similarChannelLayout, "rootSimilar");
            AbstractC26112n.m134405j0(similarChannelLayout, onClickListener);
            this.f143871J = similarChannel;
        }

        /* renamed from: j0 */
        public final SimilarChannel m151783j0() {
            return this.f143871J;
        }

        /* renamed from: k0 */
        public final void m151784k0(View.OnClickListener onClickListener) {
            AbstractC19074t.m100208f(onClickListener, "onFollowListener");
            SimpleShadowTextView simpleShadowTextView = this.f143870I.f120127r;
            simpleShadowTextView.setBackgroundResource(AbstractC27408c.zch_bg_button_active_blue);
            AbstractC19074t.m100205c(simpleShadowTextView);
            AbstractC26112n.m134425t0(simpleShadowTextView, AbstractC27406a.zch_text_primary);
            simpleShadowTextView.setText(AbstractC27413h.zch_page_notification_tab_follow);
            AbstractC26112n.m134405j0(simpleShadowTextView, onClickListener);
            AbstractC26112n.m134431w0(simpleShadowTextView);
        }

        /* renamed from: l0 */
        public final void m151785l0(View.OnClickListener onClickListener) {
            AbstractC19074t.m100208f(onClickListener, "onFollowListener");
            SimpleShadowTextView simpleShadowTextView = this.f143870I.f120127r;
            simpleShadowTextView.setBackgroundResource(AbstractC27408c.zch_bg_button_inactive);
            AbstractC19074t.m100205c(simpleShadowTextView);
            AbstractC26112n.m134425t0(simpleShadowTextView, AbstractC27406a.zch_text_tertiary);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString(" ");
            Context context = simpleShadowTextView.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            spannableString.setSpan(new C26980a(context, AbstractC23322a.zch_ic_check_solid_16, 0, 4, null), 0, 1, 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            simpleShadowTextView.setText(spannableStringBuilder);
            AbstractC26112n.m134405j0(simpleShadowTextView, onClickListener);
            AbstractC26112n.m134431w0(simpleShadowTextView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m151771R(C31175l0 c31175l0, SimilarChannel similarChannel, View view) {
        AbstractC19074t.m100208f(c31175l0, "this$0");
        AbstractC19074t.m100208f(similarChannel, "$item");
        if (view.getId() == AbstractC27409d.rootSimilar) {
            InterfaceC18505l interfaceC18505l = c31175l0.f143869t;
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(similarChannel);
                return;
            }
            return;
        }
        InterfaceC18510q interfaceC18510q = c31175l0.f143868s;
        if (interfaceC18510q != null) {
            interfaceC18510q.mo45599Hr(similarChannel.m51202c(), similarChannel.m51204e(), Boolean.valueOf(AbstractC19074t.m100204b(similarChannel.m51205f(), Boolean.TRUE)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static final void m151772S(C31175l0 c31175l0, SimilarChannel similarChannel, View view) {
        InterfaceC18510q interfaceC18510q;
        AbstractC19074t.m100208f(c31175l0, "this$0");
        AbstractC19074t.m100208f(similarChannel, "$similar");
        if (view.getId() == AbstractC27409d.btnFollow && (interfaceC18510q = c31175l0.f143868s) != null) {
            interfaceC18510q.mo45599Hr(similarChannel.m51202c(), similarChannel.m51204e(), Boolean.valueOf(AbstractC19074t.m100204b(similarChannel.m51205f(), Boolean.TRUE)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static final void m151773T(C31175l0 c31175l0, SimilarChannel similarChannel, View view) {
        InterfaceC18510q interfaceC18510q;
        AbstractC19074t.m100208f(c31175l0, "this$0");
        AbstractC19074t.m100208f(similarChannel, "$similar");
        if (view.getId() == AbstractC27409d.btnFollow && (interfaceC18510q = c31175l0.f143868s) != null) {
            interfaceC18510q.mo45599Hr(similarChannel.m51202c(), similarChannel.m51204e(), Boolean.valueOf(AbstractC19074t.m100204b(similarChannel.m51205f(), Boolean.TRUE)));
        }
    }

    /* renamed from: O */
    public final List m151774O() {
        String str;
        List<SimilarChannel> list = this.f143867r;
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (SimilarChannel similarChannel : list) {
            String m51202c = similarChannel.m51202c();
            if (m51202c != null && m51202c.length() != 0) {
                str = similarChannel.m51202c();
            } else {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        Object m131207g0;
        AbstractC19074t.m100208f(aVar, "holder");
        List list = this.f143867r;
        if (list != null) {
            m131207g0 = AbstractC25332a0.m131207g0(list, i11);
            final SimilarChannel similarChannel = (SimilarChannel) m131207g0;
            if (similarChannel != null) {
                aVar.m151782i0(similarChannel, new View.OnClickListener() { // from class: z10.k0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C31175l0.m151771R(C31175l0.this, similarChannel, view);
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo9991B(a aVar, int i11, List list) {
        Object m131206f0;
        Object m131207g0;
        AbstractC19074t.m100208f(aVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        m131206f0 = AbstractC25332a0.m131206f0(list);
        if (AbstractC19074t.m100204b(m131206f0, "ACTION_FOLLOW")) {
            List list2 = this.f143867r;
            if (list2 != null) {
                m131207g0 = AbstractC25332a0.m131207g0(list2, i11);
                final SimilarChannel similarChannel = (SimilarChannel) m131207g0;
                if (similarChannel != null) {
                    if (AbstractC19074t.m100204b(similarChannel.m51205f(), Boolean.FALSE)) {
                        aVar.m151784k0(new View.OnClickListener() { // from class: z10.i0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C31175l0.m151772S(C31175l0.this, similarChannel, view);
                            }
                        });
                        return;
                    } else {
                        if (AbstractC19074t.m100204b(similarChannel.m51205f(), Boolean.TRUE)) {
                            aVar.m151785l0(new View.OnClickListener() { // from class: z10.j0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C31175l0.m151773T(C31175l0.this, similarChannel, view);
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        super.mo9991B(aVar, i11, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        C25036n0 m129897c = C25036n0.m129897c(LayoutInflater.from(viewGroup.getContext()));
        AbstractC19074t.m100207e(m129897c, "inflate(...)");
        return new a(m129897c);
    }

    /* renamed from: V */
    public final void m151778V(List list) {
        this.f143867r = list;
    }

    /* renamed from: W */
    public final void m151779W(InterfaceC18510q interfaceC18510q) {
        this.f143868s = interfaceC18510q;
    }

    /* renamed from: X */
    public final void m151780X(InterfaceC18505l interfaceC18505l) {
        this.f143869t = interfaceC18505l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:            r1 = on0.AbstractC24340u.m127109o(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:            r1 = on0.AbstractC24340u.m127109o(r1);     */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m151781Y(String str, boolean z11, InterfaceC18505l interfaceC18505l) {
        Object m131207g0;
        Long m127109o;
        ArrayList m131500h;
        Long m127109o2;
        AbstractC19074t.m100208f(str, "channelId");
        AbstractC19074t.m100208f(interfaceC18505l, "onUpComplete");
        List list = this.f143867r;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                if (AbstractC19074t.m100204b(((SimilarChannel) it.next()).m51202c(), str)) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            m131207g0 = AbstractC25332a0.m131207g0(list, i11);
            SimilarChannel similarChannel = (SimilarChannel) m131207g0;
            if (similarChannel == null) {
                return;
            }
            String str2 = null;
            if (z11) {
                similarChannel.m51208i(Boolean.TRUE);
                String m51203d = similarChannel.m51203d();
                if (m51203d != null && m127109o2 != null) {
                    str2 = Long.valueOf(m127109o2.longValue() + 1).toString();
                }
                similarChannel.m51207h(str2);
            } else {
                similarChannel.m51208i(Boolean.FALSE);
                String m51203d2 = similarChannel.m51203d();
                if (m51203d2 != null && m127109o != null) {
                    str2 = Long.valueOf(m127109o.longValue() - 1).toString();
                }
                similarChannel.m51207h(str2);
            }
            m131500h = AbstractC25368s.m131500h("ACTION_FOLLOW");
            m10010r(i11, m131500h);
            if (z11) {
                interfaceC18505l.mo205i9(Integer.valueOf(i11));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f143867r;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
