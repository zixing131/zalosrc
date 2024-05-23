package f30;

import android.text.TextUtils;
import com.zing.zalo.stickersuggestion.topic.TensorShapeMismatchException;
import g30.C19216b;
import h30.InterfaceC19748a;
import h30.InterfaceC19749b;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import org.tensorflow.lite.InterfaceC24498e;

/* renamed from: f30.c */
/* loaded from: classes5.dex */
public class C18714c {

    /* renamed from: a */
    private LinkedList f94021a;

    /* renamed from: b */
    private LinkedList f94022b;

    /* renamed from: c */
    private final float[][] f94023c;

    /* renamed from: d */
    private final C18715d f94024d;

    /* renamed from: e */
    private final InterfaceC18712a f94025e;

    /* renamed from: f */
    private final Random f94026f;

    /* renamed from: g */
    private final InterfaceC19748a f94027g;

    public C18714c(String[] strArr, C18715d c18715d, int i11, InterfaceC18712a interfaceC18712a, InterfaceC19748a interfaceC19748a, InterfaceC19749b interfaceC19749b) {
        InterfaceC24498e.a createInterpreterOptions = interfaceC19749b.createInterpreterOptions();
        createInterpreterOptions.m127829e(i11);
        m98698h(strArr, interfaceC19749b, createInterpreterOptions);
        this.f94024d = c18715d;
        this.f94025e = interfaceC18712a;
        this.f94023c = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 1, interfaceC18712a.mo98692j());
        this.f94026f = new Random();
        this.f94027g = interfaceC19748a;
    }

    /* renamed from: b */
    private int[] m98695b(final float[] fArr, final boolean z11) {
        int length = fArr.length;
        Integer[] numArr = new Integer[length];
        for (int i11 = 0; i11 < length; i11++) {
            numArr[i11] = Integer.valueOf(i11);
        }
        Arrays.sort(numArr, new Comparator() { // from class: f30.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m98697g;
                m98697g = C18714c.m98697g(z11, fArr, (Integer) obj, (Integer) obj2);
                return m98697g;
            }
        });
        return m98696c(numArr);
    }

    /* renamed from: c */
    private int[] m98696c(Number... numberArr) {
        int length = numberArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = numberArr[i11].intValue();
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m98697g(boolean z11, float[] fArr, Integer num, Integer num2) {
        int i11;
        if (z11) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        return i11 * Float.compare(fArr[num.intValue()], fArr[num2.intValue()]);
    }

    /* renamed from: h */
    private void m98698h(String[] strArr, InterfaceC19749b interfaceC19749b, InterfaceC24498e.a aVar) {
        this.f94021a = new LinkedList();
        this.f94022b = new LinkedList();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            File file = new File(strArr[i11]);
            FileInputStream fileInputStream = new FileInputStream(file);
            InterfaceC24498e createInterpreter = interfaceC19749b.createInterpreter(fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length()), aVar);
            if (createInterpreter != null) {
                this.f94021a.addLast(createInterpreter);
                if (i11 > 0) {
                    int[] m127832a = ((InterfaceC24498e) this.f94021a.get(i11)).m127823Y(0).m127832a();
                    int[] m127832a2 = ((InterfaceC24498e) this.f94021a.get(i11 - 1)).m127822C0(0).m127832a();
                    if (!Arrays.equals(m127832a, m127832a2)) {
                        fileInputStream.close();
                        throw new TensorShapeMismatchException(m127832a2, m127832a);
                    }
                }
                int i12 = 1;
                if (i11 < strArr.length - 1) {
                    for (int i13 : ((InterfaceC24498e) this.f94021a.get(i11)).m127822C0(0).m127832a()) {
                        i12 *= i13;
                    }
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i12 * 4);
                    allocateDirect.order(ByteOrder.nativeOrder());
                    allocateDirect.rewind();
                    this.f94022b.addLast(allocateDirect);
                }
                fileInputStream.close();
            } else {
                throw new IllegalStateException("Cannot create Interpreter");
            }
        }
    }

    /* renamed from: j */
    private float[] m98699j(String str) {
        ByteBuffer m98706a = this.f94024d.m98706a(str, this.f94025e.mo98684b());
        if (m98706a == null) {
            return null;
        }
        Iterator it = this.f94022b.iterator();
        while (it.hasNext()) {
            ((ByteBuffer) it.next()).rewind();
        }
        for (int i11 = 0; i11 < this.f94021a.size(); i11++) {
            if (i11 < this.f94021a.size() - 1) {
                ((InterfaceC24498e) this.f94021a.get(i11)).m127821B(m98706a, this.f94022b.get(i11));
                m98706a = (ByteBuffer) this.f94022b.get(i11);
            } else {
                ((InterfaceC24498e) this.f94021a.getLast()).m127821B(m98706a, this.f94023c);
            }
        }
        float[] fArr = new float[this.f94023c[0].length];
        int i12 = 0;
        while (true) {
            float[] fArr2 = this.f94023c[0];
            if (i12 < fArr2.length) {
                fArr[i12] = fArr2[i12];
                i12++;
            } else {
                return fArr;
            }
        }
    }

    /* renamed from: d */
    public void m98700d() {
        this.f94025e.mo98689g();
    }

    /* renamed from: e */
    public void m98701e(String str) {
        InterfaceC18712a interfaceC18712a = this.f94025e;
        interfaceC18712a.mo98688f(interfaceC18712a.mo98690h(str));
    }

    /* renamed from: f */
    public void m98702f(String str) {
        InterfaceC18712a interfaceC18712a = this.f94025e;
        interfaceC18712a.mo98686d(interfaceC18712a.mo98690h(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:            r7 = r6.f94025e.mo98691i(r3);     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m98703i(String str, C19216b c19216b) {
        String str2;
        String str3 = "";
        if (this.f94027g.mo103465a(str)) {
            return "";
        }
        try {
            float[] m98699j = m98699j(str);
            if (m98699j == null) {
                return "";
            }
            int[] m98695b = m98695b(m98699j, false);
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= m98695b.length) {
                    str2 = "";
                    break;
                }
                i12 = m98695b[i11];
                if (this.f94023c[0][i12] >= this.f94025e.mo98693k(i12)) {
                    break;
                }
                i11++;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    float nextFloat = this.f94026f.nextFloat();
                    c19216b.m100857p(str2);
                    c19216b.m100855n(this.f94023c[0][i12]);
                    c19216b.m100854m(nextFloat);
                    c19216b.m100851j(this.f94025e.mo98693k(i12));
                    if (nextFloat >= this.f94025e.mo98685c()) {
                        return "";
                    }
                }
                return str2;
            } catch (Exception e11) {
                str3 = str2;
                e = e11;
                AbstractC20110a.m104539h(e);
                return str3;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: k */
    public void m98704k() {
        this.f94025e.mo98683a();
    }
}
