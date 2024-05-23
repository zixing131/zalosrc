package p337m1;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: m1.b */
/* loaded from: classes2.dex */
abstract class AbstractC22711b {

    /* renamed from: m1.b$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo117459a(Object obj, Rect rect);
    }

    /* renamed from: m1.b$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        Object mo117461a(Object obj, int i11);

        /* renamed from: b */
        int mo117462b(Object obj);
    }

    /* renamed from: m1.b$c */
    /* loaded from: classes2.dex */
    private static class c implements Comparator {

        /* renamed from: p */
        private final Rect f111274p = new Rect();

        /* renamed from: q */
        private final Rect f111275q = new Rect();

        /* renamed from: r */
        private final boolean f111276r;

        /* renamed from: s */
        private final a f111277s;

        c(boolean z11, a aVar) {
            this.f111276r = z11;
            this.f111277s = aVar;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Rect rect = this.f111274p;
            Rect rect2 = this.f111275q;
            this.f111277s.mo117459a(obj, rect);
            this.f111277s.mo117459a(obj2, rect2);
            int i11 = rect.top;
            int i12 = rect2.top;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
            int i13 = rect.left;
            int i14 = rect2.left;
            if (i13 < i14) {
                if (!this.f111276r) {
                    return -1;
                }
                return 1;
            }
            if (i13 > i14) {
                if (this.f111276r) {
                    return -1;
                }
                return 1;
            }
            int i15 = rect.bottom;
            int i16 = rect2.bottom;
            if (i15 < i16) {
                return -1;
            }
            if (i15 > i16) {
                return 1;
            }
            int i17 = rect.right;
            int i18 = rect2.right;
            if (i17 < i18) {
                if (!this.f111276r) {
                    return -1;
                }
                return 1;
            }
            if (i17 > i18) {
                if (this.f111276r) {
                    return -1;
                }
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    private static boolean m117465a(int i11, Rect rect, Rect rect2, Rect rect3) {
        boolean m117466b = m117466b(i11, rect, rect2);
        if (m117466b(i11, rect, rect3) || !m117466b) {
            return false;
        }
        if (m117474j(i11, rect, rect3) && i11 != 17 && i11 != 66 && m117475k(i11, rect, rect2) >= m117477m(i11, rect, rect3)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m117466b(int i11, Rect rect, Rect rect2) {
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static Object m117467c(Object obj, b bVar, a aVar, Object obj2, Rect rect, int i11) {
        Rect rect2 = new Rect(rect);
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 == 130) {
                        rect2.offset(0, -(rect.height() + 1));
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect2.offset(-(rect.width() + 1), 0);
                }
            } else {
                rect2.offset(0, rect.height() + 1);
            }
        } else {
            rect2.offset(rect.width() + 1, 0);
        }
        int mo117462b = bVar.mo117462b(obj);
        Rect rect3 = new Rect();
        Object obj3 = null;
        for (int i12 = 0; i12 < mo117462b; i12++) {
            Object mo117461a = bVar.mo117461a(obj, i12);
            if (mo117461a != obj2) {
                aVar.mo117459a(mo117461a, rect3);
                if (m117472h(i11, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    obj3 = mo117461a;
                }
            }
        }
        return obj3;
    }

    /* renamed from: d */
    public static Object m117468d(Object obj, b bVar, a aVar, Object obj2, int i11, boolean z11, boolean z12) {
        int mo117462b = bVar.mo117462b(obj);
        ArrayList arrayList = new ArrayList(mo117462b);
        for (int i12 = 0; i12 < mo117462b; i12++) {
            arrayList.add(bVar.mo117461a(obj, i12));
        }
        Collections.sort(arrayList, new c(z11, aVar));
        if (i11 != 1) {
            if (i11 == 2) {
                return m117469e(obj2, arrayList, z12);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return m117470f(obj2, arrayList, z12);
    }

    /* renamed from: e */
    private static Object m117469e(Object obj, ArrayList arrayList, boolean z11) {
        int lastIndexOf;
        int size = arrayList.size();
        if (obj == null) {
            lastIndexOf = -1;
        } else {
            lastIndexOf = arrayList.lastIndexOf(obj);
        }
        int i11 = lastIndexOf + 1;
        if (i11 < size) {
            return arrayList.get(i11);
        }
        if (z11 && size > 0) {
            return arrayList.get(0);
        }
        return null;
    }

    /* renamed from: f */
    private static Object m117470f(Object obj, ArrayList arrayList, boolean z11) {
        int indexOf;
        int size = arrayList.size();
        if (obj == null) {
            indexOf = size;
        } else {
            indexOf = arrayList.indexOf(obj);
        }
        int i11 = indexOf - 1;
        if (i11 >= 0) {
            return arrayList.get(i11);
        }
        if (z11 && size > 0) {
            return arrayList.get(size - 1);
        }
        return null;
    }

    /* renamed from: g */
    private static int m117471g(int i11, int i12) {
        return (i11 * 13 * i11) + (i12 * i12);
    }

    /* renamed from: h */
    private static boolean m117472h(int i11, Rect rect, Rect rect2, Rect rect3) {
        if (!m117473i(rect, rect2, i11)) {
            return false;
        }
        if (!m117473i(rect, rect3, i11) || m117465a(i11, rect, rect2, rect3)) {
            return true;
        }
        if (m117465a(i11, rect, rect3, rect2) || m117471g(m117475k(i11, rect, rect2), m117479o(i11, rect, rect2)) >= m117471g(m117475k(i11, rect, rect3), m117479o(i11, rect, rect3))) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m117473i(Rect rect, Rect rect2, int i11) {
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 == 130) {
                        int i12 = rect.top;
                        int i13 = rect2.top;
                        if ((i12 >= i13 && rect.bottom > i13) || rect.bottom >= rect2.bottom) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i14 = rect.left;
                int i15 = rect2.left;
                if ((i14 >= i15 && rect.right > i15) || rect.right >= rect2.right) {
                    return false;
                }
                return true;
            }
            int i16 = rect.bottom;
            int i17 = rect2.bottom;
            if ((i16 <= i17 && rect.top < i17) || rect.top <= rect2.top) {
                return false;
            }
            return true;
        }
        int i18 = rect.right;
        int i19 = rect2.right;
        if ((i18 <= i19 && rect.left < i19) || rect.left <= rect2.left) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private static boolean m117474j(int i11, Rect rect, Rect rect2) {
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 == 130) {
                        if (rect.bottom > rect2.top) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                if (rect.right > rect2.left) {
                    return false;
                }
                return true;
            }
            if (rect.top < rect2.bottom) {
                return false;
            }
            return true;
        }
        if (rect.left < rect2.right) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private static int m117475k(int i11, Rect rect, Rect rect2) {
        return Math.max(0, m117476l(i11, rect, rect2));
    }

    /* renamed from: l */
    private static int m117476l(int i11, Rect rect, Rect rect2) {
        int i12;
        int i13;
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 == 130) {
                        i12 = rect2.top;
                        i13 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i12 = rect2.left;
                    i13 = rect.right;
                }
            } else {
                i12 = rect.top;
                i13 = rect2.bottom;
            }
        } else {
            i12 = rect.left;
            i13 = rect2.right;
        }
        return i12 - i13;
    }

    /* renamed from: m */
    private static int m117477m(int i11, Rect rect, Rect rect2) {
        return Math.max(1, m117478n(i11, rect, rect2));
    }

    /* renamed from: n */
    private static int m117478n(int i11, Rect rect, Rect rect2) {
        int i12;
        int i13;
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 == 130) {
                        i12 = rect2.bottom;
                        i13 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i12 = rect2.right;
                    i13 = rect.right;
                }
            } else {
                i12 = rect.top;
                i13 = rect2.top;
            }
        } else {
            i12 = rect.left;
            i13 = rect2.left;
        }
        return i12 - i13;
    }

    /* renamed from: o */
    private static int m117479o(int i11, Rect rect, Rect rect2) {
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
