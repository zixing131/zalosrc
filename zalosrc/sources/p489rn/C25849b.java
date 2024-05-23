package p489rn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.components.CommentItemPhoto;
import com.zing.zalo.feed.components.CommentItemSticker;
import com.zing.zalo.feed.components.CommentItemText;
import com.zing.zalo.feed.components.CommentItemUnSupport;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.C10873l;
import hm0.C20096c;
import i40.C20275e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p542ub.InterfaceC27218a;

/* renamed from: rn.b */
/* loaded from: classes4.dex */
public class C25849b extends BaseAdapter {

    /* renamed from: p */
    private final InterfaceC27218a f123338p;

    /* renamed from: q */
    private LayoutInflater f123339q;

    /* renamed from: r */
    private ArrayList f123340r;

    /* renamed from: s */
    private final a f123341s;

    /* renamed from: t */
    private int f123342t;

    /* renamed from: v */
    private final C23528a f123344v;

    /* renamed from: u */
    private boolean f123343u = false;

    /* renamed from: w */
    private int f123345w = -1;

    /* renamed from: x */
    public boolean f123346x = false;

    /* renamed from: y */
    boolean f123347y = AbstractC23309i.m122055jf();

    /* renamed from: rn.b$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo46569a();

        /* renamed from: b */
        void mo46570b(C10873l c10873l, View view, C20275e c20275e, int i11);

        /* renamed from: c */
        void mo46571c(String str);

        /* renamed from: d */
        View mo46572d();

        /* renamed from: e */
        void mo46573e(C20096c c20096c);

        /* renamed from: f */
        void mo46574f(C10866e c10866e);

        /* renamed from: f1 */
        void mo46575f1(int i11, int i12, String str, int i13);

        /* renamed from: g */
        void mo46576g(boolean z11, int i11);

        /* renamed from: h */
        void mo46577h(C10873l c10873l);

        /* renamed from: i */
        void mo46578i(String str);

        /* renamed from: j */
        void mo46579j(String str);

        /* renamed from: k */
        void mo46580k(C10873l c10873l);

        /* renamed from: k0 */
        void mo46581k0(C10873l c10873l);

        /* renamed from: l */
        void mo46582l(int i11);
    }

    /* renamed from: rn.b$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a */
        int f123348a;

        /* renamed from: b */
        C10873l f123349b;

        /* renamed from: c */
        String f123350c;

        b() {
        }

        b(int i11) {
            this.f123348a = i11;
        }
    }

    /* renamed from: rn.b$c */
    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a */
        CommentItemText f123351a;

        /* renamed from: b */
        CommentItemSticker f123352b;

        /* renamed from: c */
        CommentItemPhoto f123353c;

        /* renamed from: d */
        CommentItemUnSupport f123354d;

        /* renamed from: e */
        RobotoTextView f123355e;
    }

    public C25849b(InterfaceC27218a interfaceC27218a, int i11, C23528a c23528a, a aVar) {
        this.f123339q = null;
        this.f123342t = 0;
        this.f123339q = (LayoutInflater) interfaceC27218a.getContext().getSystemService("layout_inflater");
        this.f123344v = c23528a;
        this.f123338p = interfaceC27218a;
        this.f123342t = i11;
        this.f123341s = aVar;
    }

    /* renamed from: g */
    private boolean m133426g(b bVar) {
        if (bVar == null) {
            return false;
        }
        int i11 = bVar.f123348a;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:            if (((p489rn.C25849b.c) r5.getTag()).f123355e == null) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:            r0 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:            if (((p489rn.C25849b.c) r5.getTag()).f123353c == null) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:            if (((p489rn.C25849b.c) r5.getTag()).f123352b == null) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:            if (((p489rn.C25849b.c) r5.getTag()).f123351a == null) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:            if (((p489rn.C25849b.c) r5.getTag()).f123354d == null) goto L46;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean m133427a(int i11, View view) {
        boolean z11 = false;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 6) {
                            return true;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public b m133428b() {
        ArrayList arrayList = this.f123340r;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.f123340r.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.f123348a == 4) {
                    return bVar;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public b m133429c() {
        ArrayList arrayList = this.f123340r;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.f123340r.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.f123348a == 5) {
                    return bVar;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public C10873l m133430d(int i11) {
        ArrayList arrayList = this.f123340r;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            b bVar = (b) this.f123340r.get(i11);
            if (m133426g(bVar)) {
                return bVar.f123349b;
            }
            return null;
        }
        return null;
    }

    @Override // android.widget.Adapter
    /* renamed from: e */
    public b getItem(int i11) {
        ArrayList arrayList = this.f123340r;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (b) this.f123340r.get(i11);
        }
        return null;
    }

    /* renamed from: f */
    public C10873l m133432f() {
        ArrayList arrayList = this.f123340r;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.f123340r.size() - 1; size >= 0; size--) {
                b bVar = (b) this.f123340r.get(size);
                if (bVar != null && m133426g(bVar)) {
                    return bVar.f123349b;
                }
            }
            return null;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList = this.f123340r;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i11) {
        b item = getItem(i11);
        if (item != null) {
            int i12 = item.f123348a;
            if (i12 == 0) {
                return 2;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        return 5;
                    }
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return 1;
                        }
                        return 7;
                    }
                    return 6;
                }
                return 4;
            }
            return 3;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00fb A[Catch: all -> 0x001c, Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0013, B:6:0x0017, B:13:0x0033, B:16:0x003a, B:18:0x00fb, B:21:0x0106, B:29:0x0114, B:31:0x0142, B:33:0x016f, B:35:0x019c, B:38:0x0042, B:40:0x0049, B:41:0x00f6, B:49:0x0060, B:50:0x006a, B:51:0x0074, B:52:0x0087, B:53:0x00a3, B:54:0x00bf, B:55:0x00db), top: B:2:0x0011, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0104  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View getView(int i11, View view, ViewGroup viewGroup) {
        c cVar;
        View view2 = view;
        int itemViewType = getItemViewType(i11);
        b item = getItem(i11);
        C10873l c10873l = null;
        View view3 = null;
        try {
            try {
                if (itemViewType == 5) {
                    a aVar = this.f123341s;
                    if (aVar != null) {
                        view3 = aVar.mo46572d();
                    }
                    if (view2 == null) {
                        this.f123339q.inflate(AbstractC7409c0.feed_item_unsupport, viewGroup, false);
                    }
                    return view3;
                }
                if (view2 != null && !m133427a(itemViewType, view2)) {
                    cVar = (c) view.getTag();
                    if (itemViewType != 6) {
                        cVar.f123355e.setText(item.f123350c);
                        return view2;
                    }
                    if (item != null) {
                        c10873l = item.f123349b;
                    }
                    if (c10873l != null) {
                        if (itemViewType != 1) {
                            if (itemViewType != 2) {
                                if (itemViewType != 3) {
                                    if (itemViewType == 4) {
                                        cVar.f123353c.setEnableCommentLike(this.f123347y);
                                        cVar.f123353c.setActivity(this.f123338p);
                                        cVar.f123353c.m43575X(c10873l, this.f123343u, this.f123342t, this.f123345w, i11);
                                        cVar.f123353c.m43558R(c10873l);
                                        cVar.f123353c.setCommentListener(this.f123341s);
                                        return view2;
                                    }
                                    return view2;
                                }
                                cVar.f123352b.setEnableCommentLike(this.f123347y);
                                cVar.f123352b.setActivity(this.f123338p);
                                cVar.f123352b.m43580W(c10873l, this.f123343u, this.f123342t, this.f123345w, i11);
                                cVar.f123352b.m43558R(c10873l);
                                cVar.f123352b.setCommentListener(this.f123341s);
                                return view2;
                            }
                            cVar.f123351a.setEnableCommentLike(this.f123347y);
                            cVar.f123351a.setActivity(this.f123338p);
                            cVar.f123351a.m43581T(c10873l, this.f123343u, this.f123342t, this.f123345w, i11);
                            cVar.f123351a.m43558R(c10873l);
                            cVar.f123351a.setCommentListener(this.f123341s);
                            return view2;
                        }
                        cVar.f123354d.setEnableCommentLike(this.f123347y);
                        cVar.f123354d.setActivity(this.f123338p);
                        cVar.f123354d.m43582T(c10873l, this.f123343u, this.f123342t, this.f123345w, i11);
                        cVar.f123354d.m43558R(c10873l);
                        cVar.f123354d.setCommentListener(this.f123341s);
                        return view2;
                    }
                    return view2;
                }
                cVar = new c();
                if (itemViewType == 0) {
                    view2 = this.f123339q.inflate(AbstractC7409c0.feed_item_unsupport, viewGroup, false);
                } else if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        if (itemViewType != 3) {
                            if (itemViewType != 4) {
                                if (itemViewType != 6) {
                                    if (itemViewType != 7) {
                                        view2 = this.f123339q.inflate(AbstractC7409c0.feed_item_unsupport, viewGroup, false);
                                    } else {
                                        view2 = this.f123339q.inflate(AbstractC7409c0.comment_item_loading, viewGroup, false);
                                    }
                                } else {
                                    view2 = this.f123339q.inflate(AbstractC7409c0.comment_item_info, viewGroup, false);
                                    cVar.f123355e = (RobotoTextView) view2.findViewById(AbstractC6918a0.tvComment);
                                }
                            } else {
                                view2 = this.f123339q.inflate(AbstractC7409c0.comment_item_photo, viewGroup, false);
                                CommentItemPhoto commentItemPhoto = (CommentItemPhoto) view2.findViewById(AbstractC6918a0.commentItemPhoto);
                                cVar.f123353c = commentItemPhoto;
                                commentItemPhoto.mo43563y(this.f123338p.getContext());
                            }
                        } else {
                            view2 = this.f123339q.inflate(AbstractC7409c0.comment_item_sticker, viewGroup, false);
                            CommentItemSticker commentItemSticker = (CommentItemSticker) view2.findViewById(AbstractC6918a0.commentItemSticker);
                            cVar.f123352b = commentItemSticker;
                            commentItemSticker.mo43563y(this.f123338p.getContext());
                        }
                    } else {
                        view2 = this.f123339q.inflate(AbstractC7409c0.comment_item_text, viewGroup, false);
                        CommentItemText commentItemText = (CommentItemText) view2.findViewById(AbstractC6918a0.commentItemText);
                        cVar.f123351a = commentItemText;
                        commentItemText.mo43563y(this.f123338p.getContext());
                    }
                } else {
                    view2 = this.f123339q.inflate(AbstractC7409c0.comment_item_unsupport, viewGroup, false);
                    CommentItemUnSupport commentItemUnSupport = (CommentItemUnSupport) view2.findViewById(AbstractC6918a0.commentItemUnSupport);
                    cVar.f123354d = commentItemUnSupport;
                    commentItemUnSupport.mo43563y(this.f123338p.getContext());
                }
                view2.setTag(cVar);
                if (itemViewType != 6) {
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                if (view2 == null) {
                    return this.f123339q.inflate(AbstractC7409c0.feed_item_unsupport, viewGroup, false);
                }
                return view2;
            }
        } catch (Throwable th2) {
            if (view2 == null) {
                this.f123339q.inflate(AbstractC7409c0.feed_item_unsupport, viewGroup, false);
            }
            throw th2;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 8;
    }

    /* renamed from: h */
    public void m133433h() {
        ArrayList arrayList = this.f123340r;
        if (arrayList != null) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                b bVar = (b) listIterator.previous();
                if (bVar != null && bVar.f123348a == 5) {
                    listIterator.remove();
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    public void m133434i(boolean z11) {
        if (this.f123340r == null) {
            this.f123340r = new ArrayList();
        }
        if (z11) {
            this.f123340r.add(new b(5));
        } else {
            m133433h();
        }
        notifyDataSetChanged();
    }

    /* renamed from: j */
    public void m133435j(List list) {
        try {
            b m133428b = m133428b();
            b m133429c = m133429c();
            if (list != null) {
                this.f123340r = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C10873l c10873l = (C10873l) it.next();
                    if (c10873l != null) {
                        b bVar = new b();
                        int i11 = c10873l.f54893I;
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    bVar.f123348a = 2;
                                }
                            } else {
                                bVar.f123348a = 1;
                            }
                        } else {
                            bVar.f123348a = 0;
                        }
                        bVar.f123349b = c10873l;
                        this.f123340r.add(bVar);
                    }
                }
            } else {
                this.f123340r = new ArrayList();
            }
            if (this.f123346x) {
                this.f123340r.add(new b(3));
            }
            if (m133428b != null) {
                this.f123340r.add(m133428b);
            }
            if (m133429c != null) {
                this.f123340r.add(m133429c);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public void m133436k(int i11) {
        this.f123342t = i11;
    }

    /* renamed from: l */
    public void m133437l(int i11) {
        this.f123345w = i11;
    }

    /* renamed from: m */
    public void m133438m(boolean z11) {
        this.f123343u = z11;
    }
}
