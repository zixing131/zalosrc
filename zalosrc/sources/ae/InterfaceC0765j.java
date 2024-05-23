package ae;

import bh.C2800b;
import bo.C3013n3;
import bo.C3025q0;
import bo.C3063z0;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.location.C8969o;
import com.zing.zalo.plugin.IVoipServiceRequestCallback;
import com.zing.zalo.zinstant.C17244x0;
import dj.C17945a0;
import ge.C19414f;
import hm0.InterfaceC20094a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p140ev.C18614c;
import p348mi.C23307g;
import p394oj.C24275a;
import p402os.C24548c;
import p609wh.AbstractC29004d;
import p618wq.C29192c;
import p716zh.C31832a;

/* renamed from: ae.j */
/* loaded from: classes3.dex */
public interface InterfaceC0765j {
    /* renamed from: A3 */
    void mo1384A3(byte b11, int i11, double d11, double d12, short s7, long j11);

    /* renamed from: A4 */
    void mo1385A4();

    /* renamed from: A5 */
    void mo1386A5(String str);

    /* renamed from: A6 */
    void mo1387A6(String str);

    /* renamed from: A7 */
    void mo1388A7(ArrayList arrayList, String str);

    /* renamed from: A8 */
    void mo1389A8(String str, String str2, boolean z11, int i11, boolean z12, long j11, int i12, int i13);

    /* renamed from: A9 */
    void mo1390A9(String str);

    /* renamed from: Aa */
    void mo1391Aa(long j11);

    /* renamed from: B3 */
    void mo1392B3();

    /* renamed from: B4 */
    void mo1393B4(double d11, double d12, String str, String str2, String str3, String str4, String str5, int i11, int i12, int i13, int i14, String str6);

    /* renamed from: B5 */
    void mo1394B5(double d11, double d12, String str, String str2, String str3, String str4, int i11, int i12, int i13);

    /* renamed from: B6 */
    void mo1395B6(String str, int i11);

    /* renamed from: B7 */
    void mo1396B7();

    /* renamed from: B8 */
    void mo1397B8(long j11, boolean z11);

    /* renamed from: B9 */
    void mo1398B9(String str, int i11);

    /* renamed from: Ba */
    void mo1399Ba(String str, String str2, String str3);

    /* renamed from: C3 */
    void mo1400C3(String str, TrackingSource trackingSource);

    /* renamed from: C4 */
    void mo1401C4(long j11, long j12, String str, byte b11, String str2, ArrayList arrayList, String str3);

    /* renamed from: C5 */
    void mo1402C5(String str, String str2, String str3);

    /* renamed from: C6 */
    void mo1403C6(String str, int i11);

    /* renamed from: C7 */
    void mo1404C7(String str, boolean z11, TrackingSource trackingSource, int i11);

    /* renamed from: C8 */
    void mo1405C8(int i11, int i12, int i13);

    /* renamed from: C9 */
    void mo1406C9(String str, long j11, C7904b c7904b);

    /* renamed from: Ca */
    void mo1407Ca(int i11);

    /* renamed from: D3 */
    void mo1408D3(String str);

    /* renamed from: D4 */
    void mo1409D4(ArrayList arrayList, int i11, String str);

    /* renamed from: D5 */
    void mo1410D5(int i11, int i12, int i13, int i14);

    /* renamed from: D6 */
    void mo1411D6(String str, boolean z11);

    /* renamed from: D7 */
    void mo1412D7(String str, int i11, boolean z11);

    /* renamed from: D8 */
    void mo1413D8(int i11, String str, TrackingSource trackingSource);

    /* renamed from: D9 */
    void mo1414D9(String str);

    /* renamed from: Da */
    void mo1415Da(int i11, long j11, boolean z11);

    /* renamed from: E3 */
    void mo1416E3(String str, String str2, int i11, boolean z11);

    /* renamed from: E4 */
    void mo1417E4(int i11, int i12);

    /* renamed from: E5 */
    void mo1418E5(String str, int i11, TrackingSource trackingSource);

    /* renamed from: E6 */
    void mo1419E6(ArrayList arrayList, TrackingSource trackingSource);

    /* renamed from: E7 */
    void mo1420E7(int i11, int i12);

    /* renamed from: E8 */
    void mo1421E8(String str, C17945a0 c17945a0, String str2);

    /* renamed from: E9 */
    void mo1422E9(String str, int i11, boolean z11);

    /* renamed from: Ea */
    void mo1423Ea(String str, int i11, int i12, String str2);

    /* renamed from: F3 */
    void mo1424F3(String str, boolean z11, boolean z12, String str2);

    /* renamed from: F4 */
    void mo1425F4(long j11, String str, C23307g c23307g, String str2, ArrayList arrayList, C3063z0 c3063z0, PrivacyInfo privacyInfo, boolean z11, int i11, String str3, int i12, TrackingSource trackingSource, long j12);

    /* renamed from: F5 */
    void mo1426F5(int i11, int i12, String str);

    /* renamed from: F6 */
    void mo1427F6(String str, TrackingSource trackingSource);

    /* renamed from: F7 */
    void mo1428F7(int i11, long j11, boolean z11, int i12);

    /* renamed from: F8 */
    void mo1429F8(long j11, TrackingSource trackingSource);

    /* renamed from: F9 */
    void mo1430F9();

    /* renamed from: Fa */
    void mo1431Fa();

    /* renamed from: G3 */
    void mo1432G3(String str, int i11, int i12, String str2, int i13);

    /* renamed from: G4 */
    void mo1433G4();

    /* renamed from: G5 */
    void mo1434G5(String str, long j11);

    /* renamed from: G6 */
    void mo1435G6(int i11);

    /* renamed from: G7 */
    void mo1436G7();

    /* renamed from: G8 */
    void mo1437G8(String str, long j11);

    /* renamed from: G9 */
    void mo1438G9(String str, List list);

    /* renamed from: Ga */
    void mo1439Ga(String str, TrackingSource trackingSource, int i11);

    /* renamed from: H1 */
    void mo1440H1();

    /* renamed from: H3 */
    void mo1441H3(int i11, String str, int i12, int i13, String str2);

    /* renamed from: H4 */
    void mo1442H4(String str, int i11, String str2);

    /* renamed from: H5 */
    void mo1443H5(String str, String str2, String str3);

    /* renamed from: H6 */
    void mo1444H6(String str, ArrayList arrayList, boolean z11);

    /* renamed from: H7 */
    void mo1445H7(String str, String str2, int i11, int i12, String str3);

    /* renamed from: H8 */
    void mo1446H8();

    /* renamed from: H9 */
    void mo1447H9(double d11, double d12, String str, String str2, String str3, String str4, String str5, int i11, int i12, String str6);

    /* renamed from: Ha */
    void mo1448Ha(String str, int i11);

    /* renamed from: I3 */
    void mo1449I3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13);

    /* renamed from: I4 */
    void mo1450I4(double d11, double d12);

    /* renamed from: I5 */
    void mo1451I5(String str);

    /* renamed from: I6 */
    void mo1452I6(double d11, double d12, String str, String str2);

    /* renamed from: I7 */
    void mo1453I7(ArrayList arrayList, String str);

    /* renamed from: I8 */
    void mo1454I8(int i11, String str);

    /* renamed from: I9 */
    void mo1455I9(String str, boolean z11, String str2, String str3);

    /* renamed from: Ia */
    void mo1456Ia(String str, String str2, String str3, TrackingSource trackingSource);

    /* renamed from: J3 */
    void mo1457J3(String str, String str2, String str3, String str4, int i11, String str5, boolean z11, boolean z12, String str6);

    /* renamed from: J4 */
    void mo1458J4(String[] strArr);

    /* renamed from: J5 */
    void mo1459J5(List list, boolean z11);

    /* renamed from: J6 */
    void mo1460J6(ArrayList arrayList, int i11, boolean z11);

    /* renamed from: J7 */
    void mo1461J7(String str, String str2);

    /* renamed from: J8 */
    void mo1462J8();

    /* renamed from: J9 */
    void mo1463J9(ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: Ja */
    void mo1464Ja(int i11, long j11, int i12, long j12, int i13, int i14);

    /* renamed from: K3 */
    void mo1465K3(String str, int i11, int i12, String str2);

    /* renamed from: K4 */
    void mo1466K4(String str, TrackingSource trackingSource);

    /* renamed from: K5 */
    void mo1467K5(List list, double d11, double d12);

    /* renamed from: K6 */
    void mo1468K6(int i11, int i12);

    /* renamed from: K7 */
    void mo1469K7(String str);

    /* renamed from: K8 */
    void mo1470K8(int i11, int i12);

    /* renamed from: K9 */
    void mo1471K9(double d11, double d12, int i11, int i12, int i13);

    /* renamed from: Ka */
    void mo1472Ka(ArrayList arrayList, TrackingSource trackingSource);

    /* renamed from: L3 */
    void mo1473L3(long j11);

    /* renamed from: L4 */
    void mo1474L4(String str, C17945a0 c17945a0);

    /* renamed from: L5 */
    void mo1475L5(long j11, String str, String str2, ArrayList arrayList, C3063z0 c3063z0, PrivacyInfo privacyInfo, boolean z11, int i11, C3013n3 c3013n3, TrackingSource trackingSource);

    /* renamed from: L6 */
    void mo1476L6(String str, int i11, String str2);

    /* renamed from: L7 */
    void mo1477L7(int i11, String str, String str2, int i12);

    /* renamed from: L8 */
    void mo1478L8(String str, String str2, String str3, String str4, String str5);

    /* renamed from: L9 */
    void mo1479L9(String str, int i11);

    /* renamed from: La */
    void mo1480La(String str, int i11);

    /* renamed from: M3 */
    void mo1481M3(String str, TrackingSource trackingSource);

    /* renamed from: M4 */
    void mo1482M4(String str, boolean z11);

    /* renamed from: M5 */
    void mo1483M5(String str, String str2, String str3);

    /* renamed from: M6 */
    void mo1484M6(String str, String str2, String str3, String str4);

    /* renamed from: M7 */
    void mo1485M7();

    /* renamed from: M8 */
    void mo1486M8(String str, String str2);

    /* renamed from: M9 */
    void mo1487M9(String str, int i11);

    /* renamed from: Ma */
    void mo1488Ma();

    /* renamed from: N3 */
    void mo1489N3(double d11, double d12, String str, String str2, String str3, String str4, int i11);

    /* renamed from: N4 */
    void mo1490N4(String str, String str2, String str3, String str4, String str5, String str6, int i11, String str7, int i12, String str8, int i13, String str9, String str10);

    /* renamed from: N5 */
    void mo1491N5(long j11, PrivacyInfo privacyInfo, TrackingSource trackingSource);

    /* renamed from: N6 */
    void mo1492N6(String str, String str2, String str3);

    /* renamed from: N7 */
    void mo1493N7(int i11);

    /* renamed from: N8 */
    void mo1494N8(String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18);

    /* renamed from: N9 */
    void mo1495N9(int i11);

    /* renamed from: Na */
    void mo1496Na(String str, String str2, boolean z11, boolean z12);

    /* renamed from: O3 */
    void mo1497O3(String str);

    /* renamed from: O4 */
    void mo1498O4(String str, String str2, String str3, String str4, int i11, String str5);

    /* renamed from: O5 */
    void mo1499O5(String str);

    /* renamed from: O6 */
    void mo1500O6(String str, String str2);

    /* renamed from: O7 */
    void mo1501O7(String str, int i11, int i12);

    /* renamed from: O8 */
    void mo1502O8(List list);

    /* renamed from: O9 */
    void mo1503O9(String str, int i11, TrackingSource trackingSource, boolean z11);

    /* renamed from: Oa */
    void mo1504Oa();

    /* renamed from: P3 */
    void mo1505P3(String str);

    /* renamed from: P4 */
    void mo1506P4(String str);

    /* renamed from: P5 */
    void mo1507P5(String str, int i11, String str2, boolean z11, TrackingSource trackingSource, long j11);

    /* renamed from: P6 */
    void mo1508P6(List list, int i11);

    /* renamed from: P7 */
    void mo1509P7(String str, int i11);

    /* renamed from: P8 */
    void mo1510P8(String str, String str2);

    /* renamed from: P9 */
    void mo1511P9(String str);

    /* renamed from: Pa */
    void mo1512Pa(long j11, int i11, String str);

    /* renamed from: Q3 */
    void mo1513Q3(String str, String str2, String str3, List list, boolean z11, long j11, boolean z12, boolean z13, boolean z14, boolean z15);

    /* renamed from: Q4 */
    void mo1514Q4(String str, int i11, TrackingSource trackingSource);

    /* renamed from: Q5 */
    void mo1515Q5(String str, String str2, String str3, String str4, int i11, String str5, int i12, int i13, int i14, int i15, String str6, int i16, String str7);

    /* renamed from: Q6 */
    void mo1516Q6(String str, boolean z11);

    /* renamed from: Q7 */
    void mo1517Q7(long j11);

    /* renamed from: Q8 */
    void mo1518Q8(String str);

    /* renamed from: Q9 */
    void mo1519Q9(String str, Map map);

    /* renamed from: Qa */
    void mo1520Qa(long j11, boolean z11, TrackingSource trackingSource);

    /* renamed from: R3 */
    void mo1521R3(int i11, int i12);

    /* renamed from: R4 */
    void mo1522R4(String str, int i11);

    /* renamed from: R5 */
    void mo1523R5(String str, String str2, String str3, String str4, int i11, int i12, int i13, String str5, long j11, TrackingSource trackingSource);

    /* renamed from: R6 */
    void mo1524R6();

    /* renamed from: R7 */
    void mo1525R7(long j11, int i11);

    /* renamed from: R8 */
    void mo1526R8(String str);

    /* renamed from: R9 */
    void mo1527R9(C24275a c24275a);

    /* renamed from: Ra */
    void mo1528Ra(int i11, int i12);

    /* renamed from: S3 */
    void mo1529S3(String str, int i11, int i12, int i13);

    /* renamed from: S4 */
    void mo1530S4(String str, String str2, String str3, int i11, int i12, int i13, int i14, int i15, boolean z11, boolean z12);

    /* renamed from: S5 */
    void mo1531S5(String str, String str2);

    /* renamed from: S6 */
    void mo1532S6(String str, String[] strArr, String[] strArr2, int i11, int i12, boolean z11);

    /* renamed from: S7 */
    void mo1533S7(long j11, boolean z11, long j12, long j13, String str, byte b11, String str2, ArrayList arrayList, String str3);

    /* renamed from: S8 */
    void mo1534S8(String str, String str2);

    /* renamed from: S9 */
    void mo1535S9(long j11, int i11);

    /* renamed from: Sa */
    void mo1536Sa(long j11, String str);

    /* renamed from: T3 */
    void mo1537T3(int i11, int i12, int i13, int i14);

    /* renamed from: T4 */
    void mo1538T4(String str, String str2, String str3, String str4);

    /* renamed from: T5 */
    void mo1539T5(String str, String str2, String str3, int i11, int i12, int i13, int i14, int i15, boolean z11);

    /* renamed from: T6 */
    void mo1540T6(String str, String str2, String str3, String str4, int i11);

    /* renamed from: T7 */
    void mo1541T7(String str);

    /* renamed from: T8 */
    void mo1542T8(long j11, long j12, int i11, int i12);

    /* renamed from: T9 */
    void mo1543T9(int i11, int i12, int i13, String str);

    /* renamed from: Ta */
    void mo1544Ta(String str, String str2, String str3, int i11, String str4, String str5, int i12, String str6, String str7);

    /* renamed from: U3 */
    void mo1545U3(int i11, int i12, String str);

    /* renamed from: U4 */
    void mo1546U4(String str, int i11, int i12);

    /* renamed from: U5 */
    void mo1547U5(C29192c c29192c);

    /* renamed from: U6 */
    void mo1548U6(String str, int i11, int i12, int i13, boolean z11);

    /* renamed from: U7 */
    void mo1549U7(long j11, String str, PrivacyInfo privacyInfo, List list, C3063z0 c3063z0, int i11, TrackingSource trackingSource);

    /* renamed from: U8 */
    void mo1550U8(String str, String str2, int i11, int i12);

    /* renamed from: U9 */
    void mo1551U9(String str, String str2, int i11);

    /* renamed from: Ua */
    void mo1552Ua(int i11, int i12, int i13, int i14, double d11, double d12, String str, String str2, String str3, String str4);

    /* renamed from: V3 */
    void mo1553V3(List list, int i11, String str, String str2, int i12, int i13);

    /* renamed from: V4 */
    void mo1554V4(String str, String str2, String str3, String str4, int i11, int i12, int i13, String str5, long j11, TrackingSource trackingSource);

    /* renamed from: V5 */
    void mo1555V5(String str);

    /* renamed from: V6 */
    void mo1556V6(int i11, int i12, int i13, String str);

    /* renamed from: V7 */
    void mo1557V7(int i11, int i12);

    /* renamed from: V8 */
    void mo1558V8(long j11, int i11, C24548c c24548c);

    /* renamed from: V9 */
    void mo1559V9(C18614c c18614c);

    /* renamed from: Va */
    void mo1560Va(String str, int i11, byte b11, int i12, int i13);

    /* renamed from: W3 */
    void mo1561W3(String str, String str2, String str3);

    /* renamed from: W4 */
    void mo1562W4(int i11, int i12, List list);

    /* renamed from: W5 */
    void mo1563W5(List list);

    /* renamed from: W6 */
    void mo1564W6(String str, String str2, String str3);

    /* renamed from: W7 */
    void mo1565W7();

    /* renamed from: W8 */
    void mo1566W8();

    /* renamed from: W9 */
    void mo1567W9(int i11);

    /* renamed from: Wa */
    void mo1568Wa(String str, int i11);

    /* renamed from: X3 */
    void mo1569X3(long j11);

    /* renamed from: X4 */
    void mo1570X4(String str, String str2, boolean z11, int i11, boolean z12, long j11);

    /* renamed from: X5 */
    void mo1571X5();

    /* renamed from: X6 */
    void mo1572X6(boolean z11);

    /* renamed from: X7 */
    void mo1573X7(String str, int i11, int i12, boolean z11);

    /* renamed from: X8 */
    void mo1574X8(String str);

    /* renamed from: X9 */
    void mo1575X9(String str, ArrayList arrayList);

    /* renamed from: Xa */
    void mo1576Xa();

    /* renamed from: Y3 */
    void mo1577Y3();

    /* renamed from: Y4 */
    void mo1578Y4(int i11, TrackingSource trackingSource);

    /* renamed from: Y5 */
    void mo1579Y5();

    /* renamed from: Y6 */
    void mo1580Y6(String str, String str2, String str3, int i11);

    /* renamed from: Y7 */
    void mo1581Y7(int i11);

    /* renamed from: Y8 */
    void mo1582Y8(String str, String str2, String str3, int i11, ArrayList arrayList);

    /* renamed from: Y9 */
    void mo1583Y9(String str, String str2, int i11);

    /* renamed from: Ya */
    void mo1584Ya(C31832a c31832a, int i11, int i12);

    /* renamed from: Z3 */
    void mo1585Z3(double d11, double d12, int i11, int i12, int i13, String str);

    /* renamed from: Z4 */
    void mo1586Z4(String str);

    /* renamed from: Z5 */
    void mo1587Z5(String str, int i11, int i12, boolean z11);

    /* renamed from: Z6 */
    void mo1588Z6(String str);

    /* renamed from: Z7 */
    void mo1589Z7(String str);

    /* renamed from: Z8 */
    void mo1590Z8(String str, String str2, int i11, TrackingSource trackingSource);

    /* renamed from: Z9 */
    void mo1591Z9(String str, String str2, ArrayList arrayList, C3063z0 c3063z0, PrivacyInfo privacyInfo);

    /* renamed from: Za */
    void mo1592Za(String str);

    /* renamed from: a4 */
    void mo1593a4(String str, int i11);

    /* renamed from: a5 */
    void mo1594a5(byte[] bArr);

    /* renamed from: a6 */
    void mo1595a6(Long l11);

    /* renamed from: a7 */
    void mo1596a7(int i11);

    /* renamed from: a8 */
    void mo1597a8(long j11);

    /* renamed from: a9 */
    void mo1598a9();

    /* renamed from: aa */
    void mo1599aa(String str);

    /* renamed from: ab */
    void mo1600ab(String str, TrackingSource trackingSource);

    /* renamed from: b4 */
    void mo1601b4(String str, String str2, String str3, int i11, int i12, String str4, int i13, String str5, String str6);

    /* renamed from: b5 */
    void mo1602b5(String str, int i11, String str2);

    /* renamed from: b6 */
    void mo1603b6(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, byte b11, int i12, int i13, byte b12, byte b13, int[] iArr, short s7, byte[] bArr, int i14);

    /* renamed from: b7 */
    void mo1604b7(String str, int i11, int i12, int i13);

    /* renamed from: b8 */
    void mo1605b8(String str, String str2);

    /* renamed from: b9 */
    void mo1606b9(List list);

    /* renamed from: ba */
    void mo1607ba(String str, String str2, int i11, String str3, boolean z11);

    /* renamed from: bb */
    void mo1608bb(String str, String str2, String str3, boolean z11);

    /* renamed from: c4 */
    void mo1609c4(String str, String str2, String str3);

    /* renamed from: c5 */
    void mo1610c5(String str);

    /* renamed from: c6 */
    void mo1611c6(String str, int i11, boolean z11);

    /* renamed from: c7 */
    void mo1612c7(long j11, String str, int i11, JSONObject jSONObject, JSONObject jSONObject2, String str2);

    /* renamed from: c8 */
    void mo1613c8();

    /* renamed from: c9 */
    void mo1614c9(String str, String str2);

    /* renamed from: ca */
    void mo1615ca(String str);

    /* renamed from: cb */
    void mo1616cb(String str, String str2, ArrayList arrayList);

    /* renamed from: d4 */
    void mo1617d4(String str, int i11, int i12, byte b11);

    /* renamed from: d5 */
    void mo1618d5(String str, byte b11, String str2);

    /* renamed from: d6 */
    void mo1619d6(int i11, int i12, int i13, boolean z11, int i14);

    /* renamed from: d7 */
    void mo1620d7(String str, String str2, int i11, String str3);

    /* renamed from: d8 */
    void mo1621d8(ArrayList arrayList, String str, byte b11, String str2);

    /* renamed from: d9 */
    void mo1622d9();

    /* renamed from: da */
    void mo1623da(long j11, String str, int i11);

    /* renamed from: db */
    void mo1624db(String str, List list);

    /* renamed from: e4 */
    void mo1625e4(int i11, byte b11);

    /* renamed from: e5 */
    void mo1626e5(String str, String str2);

    /* renamed from: e6 */
    void mo1627e6(String str, String str2, int i11);

    /* renamed from: e7 */
    void mo1628e7(long j11, String str, int i11, PrivacyInfo privacyInfo, List list, C3063z0 c3063z0, int i12, TrackingSource trackingSource);

    /* renamed from: e8 */
    void mo1629e8(int i11, int i12, int i13);

    /* renamed from: e9 */
    void mo1630e9(String str);

    /* renamed from: ea */
    void mo1631ea();

    /* renamed from: eb */
    void mo1632eb();

    /* renamed from: f4 */
    void mo1633f4(String str, PrivacyInfo privacyInfo);

    /* renamed from: f5 */
    void mo1634f5(int i11, int i12);

    /* renamed from: f6 */
    void mo1635f6(byte b11, int i11);

    /* renamed from: f7 */
    void mo1636f7(String str, PrivacyInfo privacyInfo);

    /* renamed from: f8 */
    void mo1637f8(int i11);

    /* renamed from: f9 */
    void mo1638f9(String str, String str2, String str3, int i11, C17244x0 c17244x0, ArrayList arrayList, C3063z0 c3063z0, PrivacyInfo privacyInfo, int i12, double d11, int i13, TrackingSource trackingSource);

    /* renamed from: fa */
    void mo1639fa(int i11, String str, int i12, int i13, int i14, int i15, int i16, int i17, int i18, String str2);

    /* renamed from: fb */
    void mo1640fb(long j11, String str, String str2, String str3, String str4, String str5);

    /* renamed from: g4 */
    void mo1641g4(String str, String str2, String str3);

    /* renamed from: g5 */
    void mo1642g5(List list, String str, byte b11);

    /* renamed from: g6 */
    void mo1643g6(String str, String str2, String str3, int i11);

    /* renamed from: g7 */
    void mo1644g7(String str, int i11, int i12, String str2);

    /* renamed from: g8 */
    void mo1645g8(String str);

    /* renamed from: g9 */
    void mo1646g9(String str);

    /* renamed from: ga */
    void mo1647ga(String str, MessageId messageId, byte b11, byte b12, byte b13);

    /* renamed from: gb */
    void mo1648gb(List list, boolean z11, boolean z12);

    /* renamed from: h4 */
    void mo1649h4(List list, int i11);

    /* renamed from: h5 */
    void mo1650h5(long j11, ArrayList arrayList);

    /* renamed from: h6 */
    void mo1651h6();

    /* renamed from: h7 */
    void mo1652h7(C24275a c24275a, TrackingSource trackingSource);

    /* renamed from: h8 */
    void mo1653h8(List list);

    /* renamed from: h9 */
    void mo1654h9(String str, String str2, String str3, int i11, int i12, String str4, int i13, String str5, String str6);

    /* renamed from: ha */
    void mo1655ha(String str, String str2);

    /* renamed from: hb */
    void mo1656hb(int i11, int i12);

    /* renamed from: i4 */
    void mo1657i4(long j11, String str, String str2, String str3, String str4, String[] strArr, String[] strArr2);

    /* renamed from: i5 */
    void mo1658i5(int i11, int i12, int i13, int i14, int i15);

    /* renamed from: i6 */
    void mo1659i6(ArrayList arrayList);

    /* renamed from: i7 */
    void mo1660i7(String str, String str2, String str3);

    /* renamed from: i8 */
    void mo1661i8(double d11, double d12, int i11, int i12, int i13, int i14, String str, String str2);

    /* renamed from: i9 */
    void mo1662i9(int i11, int i12, long j11, String str, int i13);

    /* renamed from: ia */
    void mo1663ia(String str, long j11, ArrayList arrayList);

    /* renamed from: j4 */
    void mo1664j4(ArrayList arrayList);

    /* renamed from: j5 */
    void mo1665j5(String str);

    /* renamed from: j6 */
    void mo1666j6(int i11, String str, int i12);

    /* renamed from: j7 */
    void mo1667j7();

    /* renamed from: j8 */
    void mo1668j8();

    /* renamed from: j9 */
    void mo1669j9(long j11);

    /* renamed from: ja */
    void mo1670ja(int i11, int i12, String str);

    /* renamed from: k4 */
    void mo1671k4(List list, boolean z11, int i11, int i12);

    /* renamed from: k5 */
    void mo1672k5();

    /* renamed from: k6 */
    void mo1673k6(String str);

    /* renamed from: k7 */
    void mo1674k7(String str, TrackingSource trackingSource);

    /* renamed from: k8 */
    void mo1675k8(String str, String str2, String str3);

    /* renamed from: k9 */
    void mo1676k9(List list, List list2);

    /* renamed from: ka */
    void mo1677ka(String str, int i11, int i12, int i13, int i14, int i15);

    /* renamed from: l4 */
    void mo1678l4(String str, List list);

    /* renamed from: l5 */
    void mo1679l5();

    /* renamed from: l6 */
    void mo1680l6(String str, int i11);

    /* renamed from: l7 */
    void mo1681l7(long j11);

    /* renamed from: l8 */
    void mo1682l8(String str, String str2, TrackingSource trackingSource, long j11);

    /* renamed from: l9 */
    void mo1683l9(int i11, int i12, boolean z11, int i13);

    /* renamed from: la */
    void mo1684la(String str, String str2, String str3, TrackingSource trackingSource);

    /* renamed from: m4 */
    void mo1685m4(String str, String str2);

    /* renamed from: m5 */
    void mo1686m5(List list, byte b11);

    /* renamed from: m6 */
    void mo1687m6(int i11, int i12);

    /* renamed from: m7 */
    void mo1688m7(long j11, C3025q0.b bVar, String str, ArrayList arrayList, C3063z0 c3063z0, PrivacyInfo privacyInfo, boolean z11, int i11, TrackingSource trackingSource);

    /* renamed from: m8 */
    void mo1689m8();

    /* renamed from: m9 */
    void mo1690m9(double d11, double d12, String str, String str2, String str3, String str4);

    /* renamed from: ma */
    void mo1691ma(long j11);

    /* renamed from: n4 */
    void mo1692n4(int i11, int i12, String str);

    /* renamed from: n5 */
    void mo1693n5();

    /* renamed from: n6 */
    void mo1694n6(String str, long j11, String str2, int i11);

    /* renamed from: n7 */
    void mo1695n7(ArrayList arrayList);

    /* renamed from: n8 */
    void mo1696n8(String str, int i11);

    /* renamed from: n9 */
    void mo1697n9(String str, String str2, String str3, int i11);

    /* renamed from: na */
    void mo1698na(String str, int i11, boolean z11);

    /* renamed from: o3 */
    void mo1699o3(int i11, int i12);

    /* renamed from: o4 */
    void mo1700o4(int i11, byte[] bArr, long j11, long j12, String str);

    /* renamed from: o5 */
    void mo1701o5(MessageId messageId, int i11);

    /* renamed from: o6 */
    void mo1702o6(String str, List list, List list2, String str2);

    /* renamed from: o7 */
    void mo1703o7(int i11, long j11, long j12, long j13, long j14, int i12, int i13);

    /* renamed from: o8 */
    void mo1704o8(InterfaceC20094a interfaceC20094a);

    /* renamed from: o9 */
    void mo1705o9(long j11, String str, int i11, String str2, int i12, int i13);

    /* renamed from: oa */
    void mo1706oa(long j11, String str, PrivacyInfo privacyInfo, List list, C3063z0 c3063z0, int i11, TrackingSource trackingSource);

    /* renamed from: p3 */
    void mo1707p3(String str, String str2, int i11, boolean z11);

    /* renamed from: p4 */
    void mo1708p4(String str, int i11, int i12, int i13);

    /* renamed from: p5 */
    void mo1709p5(String str, C19414f c19414f, String str2);

    /* renamed from: p6 */
    void mo1710p6(int i11, int i12, int i13, String str);

    /* renamed from: p7 */
    void mo1711p7(String str, boolean z11, boolean z12, String str2);

    /* renamed from: p8 */
    void mo1712p8(int i11, String str);

    /* renamed from: p9 */
    void mo1713p9(long j11, long j12, String str, C23307g c23307g, String str2, ArrayList arrayList, C3063z0 c3063z0, PrivacyInfo privacyInfo, String str3, int i11, TrackingSource trackingSource);

    /* renamed from: pa */
    void mo1714pa(String str, Map map, String str2, String str3, String str4);

    /* renamed from: q3 */
    void mo1715q3(String str, ArrayList arrayList);

    /* renamed from: q4 */
    void mo1716q4(int i11, int i12);

    /* renamed from: q5 */
    void mo1717q5(String str, C7904b c7904b, boolean z11, String str2);

    /* renamed from: q6 */
    void mo1718q6(String str, String str2, String str3, String str4, String str5, int i11, String str6, int i12);

    /* renamed from: q7 */
    void mo1719q7();

    /* renamed from: q8 */
    void mo1720q8(int i11);

    /* renamed from: q9 */
    void mo1721q9(String str, String str2, String str3, ArrayList arrayList, boolean z11, String str4, int i11, int i12, boolean z12, short s7, ArrayList arrayList2, double d11, double d12, ArrayList arrayList3, String str5);

    /* renamed from: qa */
    void mo1722qa(String str, int i11);

    /* renamed from: r3 */
    void mo1723r3(String str);

    /* renamed from: r4 */
    void mo1724r4(long j11, long j12, ArrayList arrayList, String str, ArrayList arrayList2, C3063z0 c3063z0, PrivacyInfo privacyInfo, ArrayList arrayList3, boolean z11, int i11, TrackingSource trackingSource, SongInfo songInfo, int i12, int i13, int i14, int i15, int i16, int i17, int i18);

    /* renamed from: r5 */
    void mo1725r5(List list, double d11, double d12);

    /* renamed from: r6 */
    void mo1726r6(String str, String str2);

    /* renamed from: r7 */
    void mo1727r7(String str, File file, long j11, String str2, AbstractC29004d abstractC29004d);

    /* renamed from: r8 */
    void mo1728r8();

    /* renamed from: r9 */
    void mo1729r9(String str, long j11, ArrayList arrayList);

    /* renamed from: ra */
    void mo1730ra(String str, int i11);

    /* renamed from: s3 */
    void mo1731s3(String str, List list, List list2);

    /* renamed from: s4 */
    void mo1732s4(String str);

    /* renamed from: s5 */
    void mo1733s5(String str, int i11, int i12, long j11, long j12, String str2, int i13, TrackingSource trackingSource);

    /* renamed from: s6 */
    void mo1734s6(String str, C17945a0 c17945a0, List list);

    /* renamed from: s7 */
    void mo1735s7(int i11, ArrayList arrayList);

    /* renamed from: s8 */
    void mo1736s8();

    /* renamed from: s9 */
    void mo1737s9(long j11);

    /* renamed from: sa */
    void mo1738sa(String str, int i11, String str2, String str3, boolean z11, boolean z12, String str4);

    /* renamed from: t3 */
    void mo1739t3(List list, int i11);

    /* renamed from: t4 */
    void mo1740t4(int i11, ArrayList arrayList, String str);

    /* renamed from: t5 */
    InterfaceC20094a mo1741t5();

    /* renamed from: t6 */
    void mo1742t6(int i11, int i12, int i13, boolean z11);

    /* renamed from: t7 */
    void mo1743t7(int i11);

    /* renamed from: t8 */
    void mo1744t8(List list);

    /* renamed from: t9 */
    void mo1745t9(String str, int i11, TrackingSource trackingSource);

    /* renamed from: ta */
    void mo1746ta();

    /* renamed from: u3 */
    void mo1747u3(String str, int i11, int i12);

    /* renamed from: u4 */
    void mo1748u4(String str, boolean z11);

    /* renamed from: u5 */
    void mo1749u5(String str, int i11);

    /* renamed from: u6 */
    void mo1750u6(String str, String str2, int i11, String str3, String str4);

    /* renamed from: u7 */
    void mo1751u7(String str, String str2);

    /* renamed from: u8 */
    void mo1752u8(long j11, String str, String str2, String str3, String str4, String str5);

    /* renamed from: u9 */
    void mo1753u9(String str, MessageId messageId, byte b11, byte b12, byte b13);

    /* renamed from: ua */
    void mo1754ua(String str, String str2, boolean z11, int i11);

    /* renamed from: v3 */
    void mo1755v3();

    /* renamed from: v4 */
    void mo1756v4(String str);

    /* renamed from: v5 */
    void mo1757v5(int i11, int i12, String str);

    /* renamed from: v6 */
    void mo1758v6(int i11);

    /* renamed from: v7 */
    void mo1759v7(String str);

    /* renamed from: v8 */
    void mo1760v8(String str);

    /* renamed from: v9 */
    void mo1761v9(int i11, int i12, String str);

    /* renamed from: va */
    void mo1762va(int i11);

    /* renamed from: w3 */
    void mo1763w3(String str);

    /* renamed from: w4 */
    void mo1764w4(String str, int i11);

    /* renamed from: w5 */
    void mo1765w5(long j11, String str, String str2, String str3);

    /* renamed from: w6 */
    void mo1766w6(int i11, TrackingSource trackingSource);

    /* renamed from: w7 */
    void mo1767w7(List list);

    /* renamed from: w8 */
    void mo1768w8(String str);

    /* renamed from: w9 */
    void mo1769w9(int i11, List list);

    /* renamed from: wa */
    void mo1770wa(int i11, int i12, int i13);

    /* renamed from: x0 */
    void mo1771x0(String str);

    /* renamed from: x3 */
    void mo1772x3(int i11, int i12, int i13, byte b11);

    /* renamed from: x4 */
    void mo1773x4();

    /* renamed from: x5 */
    void mo1774x5(String str, int i11, JSONObject jSONObject, JSONObject jSONObject2, String str2);

    /* renamed from: x6 */
    void mo1775x6(int i11);

    /* renamed from: x7 */
    void mo1776x7(int i11);

    /* renamed from: x8 */
    void mo1777x8(String str, C17945a0 c17945a0, String str2);

    /* renamed from: x9 */
    void mo1778x9(List list);

    /* renamed from: xa */
    void mo1779xa(int i11, int i12, String str, boolean z11);

    /* renamed from: y3 */
    void mo1780y3(String str);

    /* renamed from: y4 */
    void mo1781y4(String str, ArrayList arrayList, boolean z11);

    /* renamed from: y5 */
    void mo1782y5(ArrayList arrayList, TrackingSource trackingSource);

    /* renamed from: y6 */
    void mo1783y6(C2800b c2800b);

    /* renamed from: y7 */
    void mo1784y7(C8969o c8969o, boolean z11);

    /* renamed from: y8 */
    void mo1785y8();

    /* renamed from: y9 */
    void mo1786y9(String str, int i11, int i12, String str2);

    /* renamed from: ya */
    void mo1787ya(String str, String str2, String str3, String str4, int i11, String str5);

    /* renamed from: z3 */
    void mo1788z3(String str, int i11, int i12, String str2, byte[] bArr);

    /* renamed from: z4 */
    void mo1789z4(String str, byte b11);

    /* renamed from: z5 */
    void mo1790z5(String str, String str2, String str3, String str4, String str5, String str6, int i11, int i12, String str7, int i13, String str8, String str9);

    /* renamed from: z6 */
    void mo1791z6(String str, int i11);

    /* renamed from: z7 */
    void mo1792z7(int i11, ArrayList arrayList, C17945a0 c17945a0);

    /* renamed from: z8 */
    void mo1793z8(String str);

    /* renamed from: z9 */
    void mo1794z9(String str, String[] strArr);

    /* renamed from: za */
    void mo1795za();
}
