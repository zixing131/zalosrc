package com.zing.zalo.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import au.C2343e;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.uicontrol.AbstractC16661u;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uicontrol.C16665v;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import me0.AbstractC23028c0;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p348mi.AbstractC23304d;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23999j;

/* renamed from: com.zing.zalo.adapters.c2 */
/* loaded from: classes3.dex */
public class C7026c2 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    ArrayList f38397r;

    /* renamed from: s */
    int f38398s = 0;

    /* renamed from: t */
    boolean f38399t;

    /* renamed from: u */
    C23528a f38400u;

    /* renamed from: v */
    d f38401v;

    /* renamed from: w */
    public a f38402w;

    /* renamed from: x */
    int f38403x;

    /* renamed from: com.zing.zalo.adapters.c2$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: E5 */
        void mo35914E5();

        /* renamed from: Rs */
        boolean mo35915Rs(ContactProfile contactProfile);

        /* renamed from: ZE */
        void mo35916ZE();
    }

    /* renamed from: com.zing.zalo.adapters.c2$b */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        LinearLayout f38404I;

        /* renamed from: J */
        LinearLayout f38405J;

        public b(View view) {
            super(view);
            this.f38404I = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterError);
            this.f38405J = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterLoading);
        }
    }

    /* renamed from: com.zing.zalo.adapters.c2$c */
    /* loaded from: classes3.dex */
    public class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        AvatarImageView[] f38406I;

        /* renamed from: J */
        ImageView[] f38407J;

        /* renamed from: K */
        TextView[] f38408K;

        public c(View view) {
            super(view);
            int i11 = C7026c2.this.f38403x;
            this.f38406I = new AvatarImageView[i11];
            this.f38407J = new ImageView[i11];
            this.f38408K = new TextView[i11];
            LayoutInflater from = LayoutInflater.from(view.getContext());
            for (int i12 = 0; i12 < C7026c2.this.f38403x; i12++) {
                View inflate = from.inflate(AbstractC7409c0.group_member_item, (ViewGroup) null, false);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 1.0f);
                this.f38406I[i12] = (AvatarImageView) inflate.findViewById(AbstractC6918a0.participant_avatar);
                this.f38407J[i12] = (ImageView) inflate.findViewById(AbstractC6918a0.participant_group_owner);
                this.f38408K[i12] = (TextView) inflate.findViewById(AbstractC6918a0.participant_display_name);
                ((LinearLayout) view).addView(inflate, layoutParams);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.c2$d */
    /* loaded from: classes3.dex */
    public enum d {
        VIEW_ONLY_MODE,
        MANAGE_MODE,
        GROUP_NEARBY_MODE
    }

    public C7026c2(C23528a c23528a, d dVar, int i11) {
        this.f38400u = c23528a;
        this.f38401v = dVar;
        this.f38403x = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m35902T(View view) {
        a aVar = this.f38402w;
        if (aVar != null) {
            aVar.mo35916ZE();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ boolean m35903U(ContactProfile contactProfile, View view) {
        a aVar = this.f38402w;
        if (aVar != null) {
            return aVar.mo35915Rs(contactProfile);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ void m35904V(View view) {
        a aVar = this.f38402w;
        if (aVar != null) {
            aVar.mo35914E5();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        try {
            int m9931C = abstractC1876c0.m9931C();
            if (m9931C != 0) {
                if (m9931C == 1) {
                    int i12 = this.f38398s;
                    if (i12 == 1) {
                        ((b) abstractC1876c0).f38404I.setVisibility(8);
                        ((b) abstractC1876c0).f38405J.setVisibility(0);
                    } else if (i12 == 2) {
                        ((b) abstractC1876c0).f38405J.setVisibility(8);
                        ((b) abstractC1876c0).f38404I.setVisibility(0);
                        ((b) abstractC1876c0).f38404I.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.z1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C7026c2.this.m35904V(view);
                            }
                        });
                    }
                }
            } else {
                m35905O((c) abstractC1876c0, m35907Q(i11), i11, this.f38399t);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                return null;
            }
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.group_rada_footer, viewGroup, false));
        }
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        return new c(linearLayout);
    }

    /* renamed from: O */
    void m35905O(c cVar, ArrayList arrayList, int i11, boolean z11) {
        String str;
        int i12 = 0;
        while (true) {
            try {
                AvatarImageView[] avatarImageViewArr = cVar.f38406I;
                if (i12 < avatarImageViewArr.length) {
                    AvatarImageView avatarImageView = avatarImageViewArr[i12];
                    ImageView imageView = cVar.f38407J[i12];
                    TextView textView = cVar.f38408K[i12];
                    avatarImageView.setOnClickListener(null);
                    avatarImageView.setOnLongClickListener(null);
                    if (i12 < arrayList.size()) {
                        avatarImageView.setVisibility(0);
                        AbstractC16661u abstractC16661u = (AbstractC16661u) arrayList.get(i12);
                        if (abstractC16661u.m88801a() == 0) {
                            textView.setText(AbstractC8020f0.str_chat_info_participant_add_friend);
                            avatarImageView.setImageResource(AbstractC16803z.stencil_btn_addfriend);
                            avatarImageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.a2
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C7026c2.this.m35902T(view);
                                }
                            });
                        } else if (abstractC16661u.m88801a() == 1) {
                            final ContactProfile m88802b = ((C16665v) abstractC16661u).m88802b();
                            if (C23302b.f113247a.m120523d(m88802b.f42446v) && !CoreUtility.f89233i.equals(m88802b.f42434r)) {
                                avatarImageView.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m88802b.m40383Q(true, false)), C2343e.m12307a(m88802b.f42434r, false)));
                            } else {
                                avatarImageView.setImageResource(AbstractC16803z.default_avatar);
                                if (!z11 || C23999j.m125696L2(m88802b.f42446v, C23278z2.m120143n())) {
                                    ((C23528a) this.f38400u.m123612r(avatarImageView)).m123618x(m88802b.f42446v, C23278z2.m120143n());
                                }
                            }
                            avatarImageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.b2
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view) {
                                    boolean m35903U;
                                    m35903U = C7026c2.this.m35903U(m88802b, view);
                                    return m35903U;
                                }
                            });
                            if (this.f38401v != d.GROUP_NEARBY_MODE) {
                                if (((C16665v) abstractC16661u).m88803c()) {
                                    imageView.setVisibility(0);
                                    imageView.setImageResource(AbstractC16803z.ic_grpadmin);
                                } else if (((C16665v) abstractC16661u).m88804d()) {
                                    imageView.setVisibility(0);
                                    imageView.setImageResource(AbstractC16803z.ic_grpadmin_masterkey);
                                } else {
                                    imageView.setVisibility(4);
                                }
                            } else if (((C16665v) abstractC16661u).m88804d()) {
                                imageView.setVisibility(0);
                                imageView.setImageResource(AbstractC16803z.ic_grpadmin_masterkey);
                            } else {
                                imageView.setVisibility(4);
                            }
                            if (this.f38401v != d.VIEW_ONLY_MODE) {
                                textView.setVisibility(0);
                                ContactProfile contactProfile = AbstractC23304d.f113368c0;
                                if (contactProfile != null && (str = contactProfile.f42434r) != null && str.equals(m88802b.f42434r)) {
                                    textView.setText(AbstractC8020f0.str_me);
                                } else {
                                    textView.setText(m88802b.m40383Q(true, false).trim());
                                }
                            } else {
                                textView.setVisibility(8);
                            }
                        }
                    } else {
                        avatarImageView.setVisibility(4);
                        textView.setVisibility(4);
                        imageView.setVisibility(4);
                    }
                    i12++;
                } else {
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
    }

    /* renamed from: P */
    public int m35906P() {
        ArrayList arrayList = this.f38397r;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: Q */
    public ArrayList m35907Q(int i11) {
        ArrayList arrayList = new ArrayList();
        try {
            int i12 = i11 * this.f38403x;
            for (int i13 = 0; i13 < this.f38403x; i13++) {
                int i14 = i12 + i13;
                if (i14 < m35906P()) {
                    arrayList.add((AbstractC16661u) this.f38397r.get(i14));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return arrayList;
    }

    /* renamed from: R */
    public int m35908R() {
        return this.f38398s;
    }

    /* renamed from: S */
    public boolean m35909S() {
        return this.f38398s == 2;
    }

    /* renamed from: W */
    public void m35910W(a aVar) {
        this.f38402w = aVar;
    }

    /* renamed from: X */
    public void m35911X(int i11) {
        this.f38398s = i11;
    }

    /* renamed from: Y */
    public void m35912Y(ArrayList arrayList) {
        this.f38397r = new ArrayList(arrayList);
    }

    /* renamed from: Z */
    public void m35913Z(boolean z11) {
        this.f38399t = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        if (this.f38397r == null) {
            return 0;
        }
        int ceil = (int) Math.ceil(r0.size() / this.f38403x);
        if (this.f38398s != 0) {
            return ceil + 1;
        }
        return ceil;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if (this.f38398s == 0 || i11 != mo10003k() - 1) {
            return 0;
        }
        return 1;
    }
}
