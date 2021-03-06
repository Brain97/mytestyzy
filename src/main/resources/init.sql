USE TDLTE

if not exists (select * from sysobjects where name='tbPRB' )

CREATE TABLE [dbo].[tbPRB](
	[STARTTime] [dateTime] NULL,
	[PERIOD] [int] NULL,
	[enodeb] [nvarchar](255) NULL,
	[cell] [nvarchar](255) NULL,
	[cellNAME] [nvarchar](255) NULL,
	[PRB0] [int] NULL,
	[PRB1] [int] NULL,
	[PRB2] [int] NULL,
	[PRB3] [int] NULL,
	[PRB4] [int] NULL,
	[PRB5] [int] NULL,
	[PRB6] [int] NULL,
	[PRB7] [int] NULL,
	[PRB8] [int] NULL,
	[PRB9] [int] NULL,
	[PRB10] [int] NULL,
	[PRB11] [int] NULL,
	[PRB12] [int] NULL,
	[PRB13] [int] NULL,
	[PRB14] [int] NULL,
	[PRB15] [int] NULL,
	[PRB16] [int] NULL,
	[PRB17] [int] NULL,
	[PRB18] [int] NULL,
	[PRB19] [int] NULL,
	[PRB20] [int] NULL,
	[PRB21] [int] NULL,
	[PRB22] [int] NULL,
	[PRB23] [int] NULL,
	[PRB24] [int] NULL,
	[PRB25] [int] NULL,
	[PRB26] [int] NULL,
	[PRB27] [int] NULL,
	[PRB28] [int] NULL,
	[PRB29] [int] NULL,
	[PRB30] [int] NULL,
	[PRB31] [int] NULL,
	[PRB32] [int] NULL,
	[PRB33] [int] NULL,
	[PRB34] [int] NULL,
	[PRB35] [int] NULL,
	[PRB36] [int] NULL,
	[PRB37] [int] NULL,
	[PRB38] [int] NULL,
	[PRB39] [int] NULL,
	[PRB40] [int] NULL,
	[PRB41] [int] NULL,
	[PRB42] [int] NULL,
	[PRB43] [int] NULL,
	[PRB44] [int] NULL,
	[PRB45] [int] NULL,
	[PRB46] [int] NULL,
	[PRB47] [int] NULL,
	[PRB48] [int] NULL,
	[PRB49] [int] NULL,
	[PRB50] [int] NULL,
	[PRB51] [int] NULL,
	[PRB52] [int] NULL,
	[PRB53] [int] NULL,
	[PRB54] [int] NULL,
	[PRB55] [int] NULL,
	[PRB56] [int] NULL,
	[PRB57] [int] NULL,
	[PRB58] [int] NULL,
	[PRB59] [int] NULL,
	[PRB60] [int] NULL,
	[PRB61] [int] NULL,
	[PRB62] [int] NULL,
	[PRB63] [int] NULL,
	[PRB64] [int] NULL,
	[PRB65] [int] NULL,
	[PRB66] [int] NULL,
	[PRB67] [int] NULL,
	[PRB68] [int] NULL,
	[PRB69] [int] NULL,
	[PRB70] [int] NULL,
	[PRB71] [int] NULL,
	[PRB72] [int] NULL,
	[PRB73] [int] NULL,
	[PRB74] [int] NULL,
	[PRB75] [int] NULL,
	[PRB76] [int] NULL,
	[PRB77] [int] NULL,
	[PRB78] [int] NULL,
	[PRB79] [int] NULL,
	[PRB80] [int] NULL,
	[PRB81] [int] NULL,
	[PRB82] [int] NULL,
	[PRB83] [int] NULL,
	[PRB84] [int] NULL,
	[PRB85] [int] NULL,
	[PRB86] [int] NULL,
	[PRB87] [int] NULL,
	[PRB88] [int] NULL,
	[PRB89] [int] NULL,
	[PRB90] [int] NULL,
	[PRB91] [int] NULL,
	[PRB92] [int] NULL,
	[PRB93] [int] NULL,
	[PRB94] [int] NULL,
	[PRB95] [int] NULL,
	[PRB96] [int] NULL,
	[PRB97] [int] NULL,
	[PRB98] [int] NULL,
	[PRB99] [int] NULL
) ON [PRIMARY]

if not exists (select * from sysobjects where name='tbKPI' )
CREATE TABLE [dbo].[tbKPI](
[starttime] [datetime] NULL,
[period] [float] NULL,
[enodeb] [nvarchar](255) NULL,
[cell] [nvarchar](255) NULL,
[cell1] [nvarchar](255) NULL,
[PRCFINISH] [float] NULL,
[PRCREQUIRE] [float] NULL,
[PRCRATE] [float] NULL,
[ERABTOTALSUCESS] [float] NULL,
[ERABTOTALLINK] [float] NULL,
[ERABRATE] [float] NULL,
[eNodeBERABTIME] [float] NULL,
[CELLERAMTIME] [float] NULL,
[ERAMdROPRATE] [float] NULL,
[WIRELESSRATE] [float] NULL,
[ENODEBRELEASETIME] [float] NULL,
[UERELEASETIME] [float] NULL,
[UESUCCESSTIME] [float] NULL,
[WIRELESSDROPRATE] [float] NULL,
[ENODEBSUCTIMEDIFF] [float] NULL,
[ENODEBTRYTIMEDIFF] [float] NULL,
[ENODEBSUCTIMESAME] [float] NULL,
[eNBIndifsuctime] [float] NULL,
[eNBoutdifsuctime] [float] NULL,
[eNBoutdiftrytime] [float] NULL,
[eNBoutsamesuctime] [float] NULL,
[eNBoutsametrytime] [float] NULL,
[eNBinsucrate] [nvarchar](255) NULL,
[eNBoutsucrate] [float] NULL,
[zspsamerate] [float] NULL,
[zspdifrate] [nvarchar](255) NULL,
[zsprate] [float] NULL,
[totalupbits] [float] NULL,
[totaldownbits] [float] NULL,
[rrcreconntime] [float] NULL,
[rrcreconnrate] [float] NULL,
[rebuildsameoutsuctime] [float] NULL,
[rebuilddifoutsuctime] [float] NULL,
[rebuildsameinsuctime] [float] NULL,
[rebuilddifinsuctime] [float] NULL,
[eNBSUCTIME] [float] NULL,
[eNBTRYTIME] [float] NULL
) ON [PRIMARY]



if not exists (select * from sysobjects where name='tbCell' )
CREATE TABLE [dbo].[tbCell](
	[CITY] [nvarchar](255) NULL,
	[SECTORID] [varchar](50) NOT NULL,
	[SECTORNAME] [varchar](50) NULL,
	[ENODEBID] [int] NOT NULL,
	[ENODEBNAME] [varchar](50) NOT NULL,
	[EARFCN] [int] NULL,
	[PCI] [int] NULL,
	[PSS] [int] NULL,
	[SSS] [int] NULL,
	[TAC] [int] NULL,
	[VENDOR] [varchar](50) NULL,
	[LONGITUDE] [float] NOT NULL,
	[LATITUDE] [float] NOT NULL,
	[STYLE] [nvarchar](255) NULL,
	[AZIMUTH] [float] NOT NULL,
	[HEIGHT] [float] NOT NULL,
	[ELECTTILT] [float] NULL,
	[MECHTILT] [float] NULL,
	[TOTLETILT] [float] NOT NULL,
 CONSTRAINT [PK__tbCell__116AE10EDBF2A1F3] PRIMARY KEY CLUSTERED
(
	[SECTOR_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]





