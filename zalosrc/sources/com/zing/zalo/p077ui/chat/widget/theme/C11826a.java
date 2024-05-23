package com.zing.zalo.p077ui.chat.widget.theme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.chat.widget.theme.C11826a;
import com.zing.zalo.p077ui.chat.widget.theme.ChatThemePhotoRow;
import com.zing.zalo.zview.AbstractC17466e;
import java.util.ArrayList;
import java.util.List;
import p056cj.C3538f;
import p354n3.C23528a;
import t60.C26493a;

/* renamed from: com.zing.zalo.ui.chat.widget.theme.a */
/* loaded from: classes5.dex */
public class C11826a extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    List f61540r;

    /* renamed from: s */
    Context f61541s;

    /* renamed from: u */
    public LayoutInflater f61543u;

    /* renamed from: v */
    C23528a f61544v;

    /* renamed from: z */
    a f61548z;

    /* renamed from: t */
    public boolean f61542t = false;

    /* renamed from: w */
    public C3538f f61545w = null;

    /* renamed from: x */
    public C3538f f61546x = null;

    /* renamed from: y */
    public C3538f f61547y = null;

    /* renamed from: A */
    public boolean f61539A = false;

    /* renamed from: com.zing.zalo.ui.chat.widget.theme.a$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo65726a(C3538f c3538f);

        /* renamed from: b */
        void mo65727b();
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.theme.a$b */
    /* loaded from: classes5.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        public ChatThemePhotoRow f61549I;

        /* renamed from: J */
        LinearLayout f61550J;

        /* renamed from: K */
        LinearLayout f61551K;

        public b(View view, int i11, Context context) {
            super(view);
            m65740i0(view, i11, context);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0034 -> B:11:0x0037). Please report as a decompilation issue!!! */
        /* renamed from: i0 */
        void m65740i0(View view, int i11, Context context) {
            try {
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterLoading);
                        this.f61550J = linearLayout;
                        linearLayout.setBackgroundResource(AbstractC17466e.transparent);
                        this.f61551K = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterError);
                    }
                } else {
                    ChatThemePhotoRow chatThemePhotoRow = (ChatThemePhotoRow) view.findViewById(AbstractC6918a0.chatThemePhotoRow);
                    this.f61549I = chatThemePhotoRow;
                    chatThemePhotoRow.m65712d(context);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C11826a(Context context, a aVar) {
        this.f61541s = context;
        this.f61543u = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f61544v = new C23528a(context);
        this.f61548z = aVar;
        m9999J(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m65730P(View view, C3538f c3538f) {
        try {
            a aVar = this.f61548z;
            if (aVar != null) {
                aVar.mo65726a(c3538f);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m65731Q(View view) {
        a aVar = this.f61548z;
        if (aVar != null) {
            aVar.mo65727b();
        }
    }

    /* renamed from: N */
    List m65732N(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int i11 = 0;
                    while (i11 < list.size()) {
                        int i12 = i11 + 5;
                        arrayList.add(new C26493a(0, list.subList(i11, Math.min(list.size(), i12))));
                        i11 = i12;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: O */
    C26493a m65733O(int i11) {
        List list = this.f61540r;
        if (list != null && i11 >= 0 && i11 < list.size()) {
            return (C26493a) this.f61540r.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        try {
            C26493a m65733O = m65733O(i11);
            if (m65733O != null) {
                int m9931C = bVar.m9931C();
                if (m9931C != 1) {
                    if (m9931C != 2) {
                        if (m9931C == 3) {
                            bVar.f61551K.setVisibility(0);
                            bVar.f61550J.setVisibility(8);
                            bVar.f61551K.setOnClickListener(new View.OnClickListener() { // from class: t60.e
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C11826a.this.m65731Q(view);
                                }
                            });
                        }
                    } else {
                        bVar.f61550J.setVisibility(0);
                        bVar.f61551K.setVisibility(8);
                    }
                } else {
                    bVar.f61549I.m65713f(m65733O, this.f61546x, this.f61547y, i11, this.f61542t);
                    bVar.f61549I.setOnThemeRowClickListener(new ChatThemePhotoRow.InterfaceC11820e() { // from class: t60.d
                        @Override // com.zing.zalo.p077ui.chat.widget.theme.ChatThemePhotoRow.InterfaceC11820e
                        /* renamed from: a */
                        public final void mo65715a(View view, C3538f c3538f) {
                            C11826a.this.m65730P(view, c3538f);
                        }
                    });
                    if (i11 == 0 && !this.f61542t) {
                        ChatThemePhotoRow chatThemePhotoRow = bVar.f61549I;
                        if (!chatThemePhotoRow.f61516z) {
                            chatThemePhotoRow.m65714g(true);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        View inflate;
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                inflate = this.f61543u.inflate(AbstractC7409c0.feed_item_unsupport, viewGroup, false);
            } else {
                inflate = this.f61543u.inflate(AbstractC7409c0.footer_loading, viewGroup, false);
            }
        } else {
            inflate = this.f61543u.inflate(AbstractC7409c0.chat_theme_photo_row, viewGroup, false);
        }
        return new b(inflate, i11, this.f61541s);
    }

    /* renamed from: T */
    public void m65736T(List list) {
        this.f61540r = m65732N(list);
    }

    /* renamed from: U */
    public void m65737U(C3538f c3538f) {
        this.f61546x = c3538f;
        m10008p();
    }

    /* renamed from: V */
    public void m65738V(boolean z11) {
        try {
            this.f61539A = z11;
            if (z11) {
                if (this.f61540r == null) {
                    this.f61540r = new ArrayList();
                }
                C26493a c26493a = new C26493a();
                c26493a.m136470g(2);
                this.f61540r.add(c26493a);
                m10011s(this.f61540r.size() - 1);
                return;
            }
            int mo10003k = mo10003k();
            for (int i11 = 0; i11 < mo10003k; i11++) {
                if (m65733O(i11).f125728a == 2) {
                    this.f61540r.remove(i11);
                    m10017y(i11 + 1);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: W */
    public void m65739W(boolean z11) {
        try {
            if (z11) {
                if (this.f61540r == null) {
                    this.f61540r = new ArrayList();
                }
                C26493a c26493a = new C26493a();
                c26493a.m136470g(1);
                this.f61540r.add(c26493a);
                m10011s(this.f61540r.size() - 1);
                return;
            }
            int mo10003k = mo10003k();
            for (int i11 = 0; i11 < mo10003k; i11++) {
                if (m65733O(i11).f125728a == 1) {
                    this.f61540r.remove(i11);
                    m10017y(i11 + 1);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f61540r;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        try {
            List list = this.f61540r;
            if (list == null) {
                return 0;
            }
            int i12 = ((C26493a) list.get(i11)).f125728a;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        return 0;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }
}
