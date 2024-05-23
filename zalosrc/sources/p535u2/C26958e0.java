package p535u2;

import android.net.Uri;
import android.os.Build;
import androidx.work.C2142e;
import androidx.work.C2149h0;
import androidx.work.EnumC2134a;
import androidx.work.EnumC2254v;
import androidx.work.EnumC2258z;
import bn0.AbstractC2933b;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import pm0.C24848g0;

/* renamed from: u2.e0 */
/* loaded from: classes.dex */
public final class C26958e0 {

    /* renamed from: a */
    public static final C26958e0 f127460a = new C26958e0();

    /* renamed from: u2.e0$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f127461a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f127462b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f127463c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f127464d;

        static {
            int[] iArr = new int[C2149h0.c.values().length];
            try {
                iArr[C2149h0.c.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C2149h0.c.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C2149h0.c.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C2149h0.c.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C2149h0.c.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C2149h0.c.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f127461a = iArr;
            int[] iArr2 = new int[EnumC2134a.values().length];
            try {
                iArr2[EnumC2134a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC2134a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f127462b = iArr2;
            int[] iArr3 = new int[EnumC2254v.values().length];
            try {
                iArr3[EnumC2254v.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC2254v.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[EnumC2254v.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[EnumC2254v.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[EnumC2254v.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f127463c = iArr3;
            int[] iArr4 = new int[EnumC2258z.values().length];
            try {
                iArr4[EnumC2258z.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[EnumC2258z.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f127464d = iArr4;
        }
    }

    private C26958e0() {
    }

    /* renamed from: a */
    public static final int m138924a(EnumC2134a enumC2134a) {
        AbstractC19074t.m100208f(enumC2134a, "backoffPolicy");
        int i11 = a.f127462b[enumC2134a.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 0;
    }

    /* renamed from: b */
    public static final Set m138925b(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, ZMediaPlayer.OnNativeInvokeListener.ARG_BYTES);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i11 = 0; i11 < readInt; i11++) {
                        Uri parse = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        AbstractC19074t.m100207e(parse, "uri");
                        linkedHashSet.add(new C2142e.c(parse, readBoolean));
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    AbstractC2933b.m13890a(objectInputStream, null);
                } finally {
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            C24848g0 c24848g02 = C24848g0.f119245a;
            AbstractC2933b.m13890a(byteArrayInputStream, null);
            return linkedHashSet;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC2933b.m13890a(byteArrayInputStream, th2);
                throw th3;
            }
        }
    }

    /* renamed from: c */
    public static final EnumC2134a m138926c(int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                return EnumC2134a.LINEAR;
            }
            throw new IllegalArgumentException("Could not convert " + i11 + " to BackoffPolicy");
        }
        return EnumC2134a.EXPONENTIAL;
    }

    /* renamed from: d */
    public static final EnumC2254v m138927d(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i11 == 5) {
                                return EnumC2254v.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException("Could not convert " + i11 + " to NetworkType");
                        }
                        return EnumC2254v.METERED;
                    }
                    return EnumC2254v.NOT_ROAMING;
                }
                return EnumC2254v.UNMETERED;
            }
            return EnumC2254v.CONNECTED;
        }
        return EnumC2254v.NOT_REQUIRED;
    }

    /* renamed from: e */
    public static final EnumC2258z m138928e(int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                return EnumC2258z.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException("Could not convert " + i11 + " to OutOfQuotaPolicy");
        }
        return EnumC2258z.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    /* renamed from: f */
    public static final C2149h0.c m138929f(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                return C2149h0.c.CANCELLED;
                            }
                            throw new IllegalArgumentException("Could not convert " + i11 + " to State");
                        }
                        return C2149h0.c.BLOCKED;
                    }
                    return C2149h0.c.FAILED;
                }
                return C2149h0.c.SUCCEEDED;
            }
            return C2149h0.c.RUNNING;
        }
        return C2149h0.c.ENQUEUED;
    }

    /* renamed from: g */
    public static final int m138930g(EnumC2254v enumC2254v) {
        AbstractC19074t.m100208f(enumC2254v, "networkType");
        int i11 = a.f127463c[enumC2254v.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return 1;
            }
            if (i11 != 3) {
                if (i11 == 4) {
                    return 3;
                }
                if (i11 != 5) {
                    if (Build.VERSION.SDK_INT >= 30 && enumC2254v == EnumC2254v.TEMPORARILY_UNMETERED) {
                        return 5;
                    }
                    throw new IllegalArgumentException("Could not convert " + enumC2254v + " to int");
                }
                return 4;
            }
            return 2;
        }
        return 0;
    }

    /* renamed from: h */
    public static final int m138931h(EnumC2258z enumC2258z) {
        AbstractC19074t.m100208f(enumC2258z, "policy");
        int i11 = a.f127464d[enumC2258z.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 0;
    }

    /* renamed from: i */
    public static final byte[] m138932i(Set set) {
        AbstractC19074t.m100208f(set, "triggers");
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    C2142e.c cVar = (C2142e.c) it.next();
                    objectOutputStream.writeUTF(cVar.m11518a().toString());
                    objectOutputStream.writeBoolean(cVar.m11519b());
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC2933b.m13890a(objectOutputStream, null);
                AbstractC2933b.m13890a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                AbstractC19074t.m100207e(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC2933b.m13890a(byteArrayOutputStream, th2);
                throw th3;
            }
        }
    }

    /* renamed from: j */
    public static final int m138933j(C2149h0.c cVar) {
        AbstractC19074t.m100208f(cVar, "state");
        switch (a.f127461a[cVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
