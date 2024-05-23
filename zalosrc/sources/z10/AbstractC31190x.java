package z10;

import androidx.recyclerview.widget.AbstractC1915h;
import b10.AbstractC2487f;
import b10.C2484c;
import b10.C2491j;
import com.zing.zalo.shortvideo.data.model.C9440a;
import com.zing.zalo.shortvideo.data.model.Content;
import com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse;
import fn0.AbstractC19074t;

/* renamed from: z10.x */
/* loaded from: classes5.dex */
public abstract class AbstractC31190x {

    /* renamed from: a */
    private static final AbstractC1915h.d f143998a = new a();

    /* renamed from: z10.x$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC1915h.d {
        a() {
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo10506a(AbstractC2487f abstractC2487f, AbstractC2487f abstractC2487f2) {
            String str;
            String str2;
            String str3;
            String str4;
            Integer num;
            Content m51667a;
            Content.Highlight[] m50895b;
            Content m51667a2;
            Content.Highlight[] m50895b2;
            Content m51667a3;
            Content m51667a4;
            String str5;
            String str6;
            String str7;
            String str8;
            Integer num2;
            Content m51667a5;
            Content.Highlight[] m50895b3;
            Content m51667a6;
            Content.Highlight[] m50895b4;
            Content m51667a7;
            Content m51667a8;
            AbstractC19074t.m100208f(abstractC2487f, "oldItem");
            AbstractC19074t.m100208f(abstractC2487f2, "newItem");
            if ((abstractC2487f instanceof C9440a) && (abstractC2487f2 instanceof C9440a)) {
                C9440a c9440a = (C9440a) abstractC2487f;
                C9440a c9440a2 = (C9440a) abstractC2487f2;
                if (AbstractC19074t.m100204b(c9440a.m51401d(), c9440a2.m51401d()) && c9440a.m51402e() == c9440a2.m51402e() && AbstractC19074t.m100204b(c9440a.m51408k(), c9440a2.m51408k())) {
                    return true;
                }
            } else {
                Integer num3 = null;
                if ((abstractC2487f instanceof C2484c) && (abstractC2487f2 instanceof C2484c)) {
                    C2484c c2484c = (C2484c) abstractC2487f;
                    InteractEventResponse.InteractItem m12549b = c2484c.m12549b();
                    if (m12549b != null) {
                        str5 = m12549b.m51668b();
                    } else {
                        str5 = null;
                    }
                    C2484c c2484c2 = (C2484c) abstractC2487f2;
                    InteractEventResponse.InteractItem m12549b2 = c2484c2.m12549b();
                    if (m12549b2 != null) {
                        str6 = m12549b2.m51668b();
                    } else {
                        str6 = null;
                    }
                    if (AbstractC19074t.m100204b(str5, str6)) {
                        InteractEventResponse.InteractItem m12549b3 = c2484c.m12549b();
                        if (m12549b3 != null && (m51667a8 = m12549b3.m51667a()) != null) {
                            str7 = m51667a8.m50896c();
                        } else {
                            str7 = null;
                        }
                        InteractEventResponse.InteractItem m12549b4 = c2484c2.m12549b();
                        if (m12549b4 != null && (m51667a7 = m12549b4.m51667a()) != null) {
                            str8 = m51667a7.m50896c();
                        } else {
                            str8 = null;
                        }
                        if (AbstractC19074t.m100204b(str7, str8)) {
                            InteractEventResponse.InteractItem m12549b5 = c2484c.m12549b();
                            if (m12549b5 != null && (m51667a6 = m12549b5.m51667a()) != null && (m50895b4 = m51667a6.m50895b()) != null) {
                                num2 = Integer.valueOf(m50895b4.length);
                            } else {
                                num2 = null;
                            }
                            InteractEventResponse.InteractItem m12549b6 = c2484c2.m12549b();
                            if (m12549b6 != null && (m51667a5 = m12549b6.m51667a()) != null && (m50895b3 = m51667a5.m50895b()) != null) {
                                num3 = Integer.valueOf(m50895b3.length);
                            }
                            if (AbstractC19074t.m100204b(num2, num3)) {
                                return true;
                            }
                        }
                    }
                } else if ((abstractC2487f instanceof C2491j) && (abstractC2487f2 instanceof C2491j)) {
                    C2491j c2491j = (C2491j) abstractC2487f;
                    InteractEventResponse.InteractItem m12574b = c2491j.m12574b();
                    if (m12574b != null) {
                        str = m12574b.m51668b();
                    } else {
                        str = null;
                    }
                    C2491j c2491j2 = (C2491j) abstractC2487f2;
                    InteractEventResponse.InteractItem m12574b2 = c2491j2.m12574b();
                    if (m12574b2 != null) {
                        str2 = m12574b2.m51668b();
                    } else {
                        str2 = null;
                    }
                    if (AbstractC19074t.m100204b(str, str2)) {
                        InteractEventResponse.InteractItem m12574b3 = c2491j.m12574b();
                        if (m12574b3 != null && (m51667a4 = m12574b3.m51667a()) != null) {
                            str3 = m51667a4.m50896c();
                        } else {
                            str3 = null;
                        }
                        InteractEventResponse.InteractItem m12574b4 = c2491j2.m12574b();
                        if (m12574b4 != null && (m51667a3 = m12574b4.m51667a()) != null) {
                            str4 = m51667a3.m50896c();
                        } else {
                            str4 = null;
                        }
                        if (AbstractC19074t.m100204b(str3, str4)) {
                            InteractEventResponse.InteractItem m12574b5 = c2491j.m12574b();
                            if (m12574b5 != null && (m51667a2 = m12574b5.m51667a()) != null && (m50895b2 = m51667a2.m50895b()) != null) {
                                num = Integer.valueOf(m50895b2.length);
                            } else {
                                num = null;
                            }
                            InteractEventResponse.InteractItem m12574b6 = c2491j2.m12574b();
                            if (m12574b6 != null && (m51667a = m12574b6.m51667a()) != null && (m50895b = m51667a.m50895b()) != null) {
                                num3 = Integer.valueOf(m50895b.length);
                            }
                            if (AbstractC19074t.m100204b(num, num3)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo10507b(AbstractC2487f abstractC2487f, AbstractC2487f abstractC2487f2) {
            AbstractC19074t.m100208f(abstractC2487f, "oldItem");
            AbstractC19074t.m100208f(abstractC2487f2, "newItem");
            if ((abstractC2487f instanceof C9440a) && (abstractC2487f2 instanceof C9440a)) {
                if (!AbstractC19074t.m100204b(((C9440a) abstractC2487f).m51401d(), ((C9440a) abstractC2487f2).m51401d()) || abstractC2487f.m12570a() != abstractC2487f2.m12570a()) {
                    return false;
                }
            } else if ((!(abstractC2487f instanceof C2484c) || !(abstractC2487f2 instanceof C2484c)) && (!(abstractC2487f instanceof C2491j) || !(abstractC2487f2 instanceof C2491j))) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static final AbstractC1915h.d m151953a() {
        return f143998a;
    }
}
